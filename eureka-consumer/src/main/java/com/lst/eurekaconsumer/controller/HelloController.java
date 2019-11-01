package com.lst.eurekaconsumer.controller;

import com.lst.eurekaconsumer.service.HelloService;
import com.lst.eurekaconsumer.vo.NumberVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    @RequestMapping(value = "/test")
    public String test(String name){
        return helloService.hello(name);
    }

    @RequestMapping(value = "/add")
    public Integer test(Integer num1,Integer num2){
        return helloService.add(num1,num2);
    }

}
