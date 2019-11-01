package com.lst.eurekaconsumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Service
@FeignClient(value = "eureka-provider")
public interface HelloService {

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    String hello(@RequestParam("name") String name);

    @RequestMapping(value = "/add",method = RequestMethod.GET)
    Integer add(@RequestParam("num1") Integer num1,@RequestParam("num2") Integer num2);

}
