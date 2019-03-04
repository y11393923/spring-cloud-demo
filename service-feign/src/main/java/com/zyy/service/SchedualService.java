package com.zyy.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "eureka-client",fallback = SchedualServiceHiHystric.class)
public interface SchedualService {
    @RequestMapping(value = "/{name}",method = RequestMethod.GET)
    String sayHiFromClientOne(@PathVariable("name")String name);
}
