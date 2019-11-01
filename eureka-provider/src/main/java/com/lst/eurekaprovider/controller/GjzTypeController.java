package com.lst.eurekaprovider.controller;

import com.lst.eurekaprovider.model.Gjz;
import com.lst.eurekaprovider.model.GjzType;
import com.lst.eurekaprovider.service.IGjzService;
import com.lst.eurekaprovider.service.IGjzTypeService;
import com.lst.eurekaprovider.util.JsonData;
import com.lst.eurekaprovider.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController("/gjzType")
public class GjzTypeController {

    @Autowired
    private IGjzTypeService gjzTypeService;

    @ModelAttribute
    public void init(Model model){
        GjzType gjzType=new GjzType();
        model.addAttribute("gjzType",gjzType);
    }

    @GetMapping("/del/{gjid}")
    @ResponseBody
    public JsonData del(@PathVariable Integer gjid){
        GjzType gjzType=new GjzType();
        gjzType.setGjid(gjid);
        this.gjzTypeService.deleteGjzType(gjzType);
        JsonData jsonData=new JsonData();
        jsonData.setCode(0);
        jsonData.setMessage("删除成功");
        return jsonData;
    }

    @GetMapping("/load/{gjid}")
    @ResponseBody
    public JsonData load(@PathVariable Integer gjid){
        GjzType gjzType=new GjzType();
        gjzType.setGjid(gjid);
        GjzType gjzTypea=this.gjzTypeService.load(gjzType);
        JsonData jsonData=new JsonData();
        jsonData.setCode(0);
        jsonData.put("gjzType",gjzTypea);
        return jsonData;
    }

    @PostMapping("/add")
    @ResponseBody
    public JsonData add(GjzType gjzType){
        this.gjzTypeService.add(gjzType);
        JsonData jsonData=new JsonData();
        jsonData.setCode(0);
        jsonData.setMessage("增加成功");
        return jsonData;
    }

    @PostMapping("/update")
    @ResponseBody
    public JsonData update(GjzType gjzType){
        this.gjzTypeService.updateGjzType(gjzType);
        JsonData jsonData=new JsonData();
        jsonData.setCode(0);
        jsonData.setMessage("修改成功");
        return jsonData;
    }

    @PostMapping("/list")
    @ResponseBody
    public JsonData list(GjzType gjzType, PageBean pageBean){
        List<GjzType> gjzTypes=this.gjzTypeService.listGjzType(gjzType,pageBean);
        JsonData jsonData=new JsonData();
        jsonData.setCode(0);
        jsonData.put("gjzTypes",gjzTypes);
        return jsonData;
    }

}
