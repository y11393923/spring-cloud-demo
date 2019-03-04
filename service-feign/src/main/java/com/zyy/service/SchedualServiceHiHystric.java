package com.zyy.service;

import org.springframework.stereotype.Component;

/**
 * @author Administrator
 * @create 2019/2/26
 * @since 1.0.0
 */
@Component
public class SchedualServiceHiHystric implements SchedualService{

    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
