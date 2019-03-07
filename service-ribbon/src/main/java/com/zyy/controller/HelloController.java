package com.zyy.controller;

import com.zyy.service.HelloService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
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
@Api(tags = "ribbon客户端")
public class HelloController {
    @Autowired
    private HelloService helloService;

    @RequestMapping("/{name}")
    @ApiOperation(value = "ribbon测试接口",httpMethod = "GET")
    @ApiImplicitParam(name = "name",value = "名称",paramType = "path")
    public String hi(@PathVariable("name")String name){
        return helloService.hiService(name);
    }
}
