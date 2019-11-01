package com.lst.eurekaprovider;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;
import org.springframework.core.io.ClassPathResource;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

public class GeneratorHelper {
    public static void main(String[] args) throws Exception {
        try {
            GeneratorHelper generatorSqlmap = new GeneratorHelper();
            generatorSqlmap.generator();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void generator() throws Exception {
        List<String> warnings = new ArrayList<String>();
        boolean overwrite = true;
        ConfigurationParser cp = new ConfigurationParser(warnings);
        //指定 逆向工程配置文件（generatorConfig.xml里面context节点必须按顺序配置,不然会报错）
        //InputStream configFile = GeneratorHelper.class.getClassLoader().getResourceAsStream("generatorConfig.xml");
        File configFile = new ClassPathResource("generatorConfig.xml").getFile();
        InputStream configFileStream = autoTransferConfig(configFile);
        Configuration config = cp.parseConfiguration(configFileStream);
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
        myBatisGenerator.generate(null);
        warnings.forEach(System.out::println);
        System.out.println("------ generator is finish ------");
    }

    private InputStream autoTransferConfig(File configFile) throws DocumentException, UnsupportedEncodingException {
        SAXReader sr = new SAXReader(); // 需要导入jar包:dom4j
        Document document = sr.read(configFile);
        // 获取根元素
        Element generatorConfiguration = document.getRootElement();
        String projectRoot = document.getName().split("target")[0].replace("file://", "");
        if(isWindows() && projectRoot.startsWith("/")){
            projectRoot = projectRoot.substring(1);
        }
        // 获取标签
        Element classPathEntry = generatorConfiguration.element("classPathEntry");
        Element context = generatorConfiguration.element("context");
        Element javaModelGenerator = context.element("javaModelGenerator");
        Element sqlMapGenerator = context.element("sqlMapGenerator");
        Element javaClientGenerator = context.element("javaClientGenerator");
        Attribute classPathEntryLoc = classPathEntry.attribute("location");
        Attribute javaModelTarget = javaModelGenerator.attribute("targetProject");
        Attribute sqlMapTarget = sqlMapGenerator.attribute("targetProject");
        Attribute javaClientTarget = javaClientGenerator.attribute("targetProject");
        String classPathEntryLocText = classPathEntryLoc.getText();
        if (isRelativePath(classPathEntryLocText)) {
            classPathEntryLoc.setText(projectRoot + classPathEntryLocText);
        }
        String javaModelTargetText = javaModelTarget.getText();
        if (isRelativePath(javaModelTargetText)) {
            javaModelTarget.setText(projectRoot + javaModelTargetText);
        }
        String sqlMapTargetText = sqlMapTarget.getText();
        if (isRelativePath(sqlMapTargetText)) {
            sqlMapTarget.setText(projectRoot + sqlMapTargetText);
        }
        String javaClientTargetText = javaClientTarget.getText();
        if (isRelativePath(javaClientTargetText)) {
            javaClientTarget.setText(projectRoot + javaClientTargetText);
        }
        return new ByteArrayInputStream(document.asXML().getBytes("utf-8"));
    }

    //判断是否为相对路径
    private boolean isRelativePath(String value) {
        if (value != null) {
            if (!value.contains(":") && !value.startsWith("/")) {
                return true;
            }
        }
        return false;
    }

    //判断是否为Windows操作系统
    public boolean isWindows() {
        return System.getProperties().getProperty("os.name").toLowerCase().indexOf("windows") >= 0;
    }

}
