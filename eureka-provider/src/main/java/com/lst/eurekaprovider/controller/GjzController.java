package com.lst.eurekaprovider.controller;

import com.lst.eurekaprovider.model.Gjz;
import com.lst.eurekaprovider.service.IGjzService;
import com.lst.eurekaprovider.util.JsonData;
import com.lst.eurekaprovider.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController("/gjz")
public class GjzController {

    @Autowired
    private IGjzService gjzService;

    @ModelAttribute
    public void init(Model model){
        Gjz gjz=new Gjz();
        model.addAttribute("gjz",gjz);
    }

    @GetMapping("/del/{jid}")
    @ResponseBody
    public JsonData del(@PathVariable Integer jid){
        Gjz gjz=new Gjz();
        gjz.setJid(jid);
        this.gjzService.deleteGjz(gjz);
        JsonData jsonData=new JsonData();
        jsonData.setCode(0);
        jsonData.setMessage("删除成功");
        return jsonData;
    }

    @GetMapping("/load/{jid}")
    @ResponseBody
    public JsonData load(@PathVariable Integer jid){
        Gjz gjz=new Gjz();
        gjz.setJid(jid);
        Gjz gjz1=this.gjzService.load(gjz);
        JsonData jsonData=new JsonData();
        jsonData.setCode(0);
        jsonData.put("gjz",gjz1);
        return jsonData;
    }

    @PostMapping("/add")
    @ResponseBody
    public JsonData add(Gjz gjz){
        this.gjzService.add(gjz);
        JsonData jsonData=new JsonData();
        jsonData.setCode(0);
        jsonData.setMessage("增加成功");
        return jsonData;
    }

    @PostMapping("/update")
    @ResponseBody
    public JsonData update(Gjz gjz){
        this.gjzService.updateGjz(gjz);
        JsonData jsonData=new JsonData();
        jsonData.setCode(0);
        jsonData.setMessage("修改成功");
        return jsonData;
    }

    @PostMapping("/list")
    @ResponseBody
    public JsonData list(Gjz gjz, PageBean pageBean){
        List<Gjz> gjzs=this.gjzService.listGjz(gjz,pageBean);
        JsonData jsonData=new JsonData();
        jsonData.setCode(0);
        jsonData.put("gjzs",gjzs);
        return jsonData;
    }


}
