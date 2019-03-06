package com.zyy.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 * @create 2019/3/6
 * @since 1.0.0
 */
@RestController
@Api(tags = "测试Api")
@RequestMapping("/swagger")
public class SwaggerController {

    @GetMapping("/test")
    @ApiOperation(value = "swagger测试接口",httpMethod = "GET")
    @ApiImplicitParam(name = "name", value = "用户名称", required = true, dataType = "String")
    public String hello(String name){
        return "hello swagger 你好:"+name;
    }
}
