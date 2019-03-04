package com.zyy.controller;

import com.zyy.service.SchedualService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 * @create 2019/2/26
 * @since 1.0.0
 */
@RestController
public class SchedualController {
    @Autowired
    private SchedualService schedualService;

    @GetMapping("/{name}")
    public String sayHi(@PathVariable("name")String name){
        return schedualService.sayHiFromClientOne(name);
    }

}
