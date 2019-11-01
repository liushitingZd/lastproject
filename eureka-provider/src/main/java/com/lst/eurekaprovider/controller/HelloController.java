package com.lst.eurekaprovider.controller;

import com.lst.eurekaprovider.vo.NumberVo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(String name){
        String str="我是生产者，很高兴为您["+name+"]服务";
        return str;
    }

    @GetMapping("/add")
    public int add(NumberVo numberVo){
        return numberVo.getNum1()+numberVo.getNum2();
    }

}
