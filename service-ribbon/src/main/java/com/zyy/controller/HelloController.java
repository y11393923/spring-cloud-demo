package com.zyy.controller;

import com.zyy.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 * @create 2019/2/26
 * @since 1.0.0
 */
@RestController
public class HelloController {
    @Autowired
    private HelloService helloService;

    @RequestMapping("/{name}")
    public String hi(@PathVariable("name")String name){
        return helloService.hiService(name);
    }
}
