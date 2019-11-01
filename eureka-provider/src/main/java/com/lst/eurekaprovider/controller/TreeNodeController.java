package com.lst.eurekaprovider.controller;


import com.lst.eurekaprovider.model.TreeNode;
import com.lst.eurekaprovider.service.ItreeNodeService;
import com.lst.eurekaprovider.util.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class TreeNodeController {

    @Autowired
    private ItreeNodeService itreeNodeService;


    @RequestMapping("/treeNodelist")
    @ResponseBody
    public JsonData listAll(Model model){
        JsonData jsonData = new JsonData();
        jsonData.setCode(0);
        List<TreeNode> list = itreeNodeService.listAll();
        jsonData.put("list",list);
        return jsonData;
    }

}
