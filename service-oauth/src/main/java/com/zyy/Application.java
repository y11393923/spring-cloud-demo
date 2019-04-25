package com.zyy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

/**
 * @author Administrator
 * EnableResourceServer注解开启资源服务,因为程序需要对外暴露获取token的API和验证token的API所以该程序也是一个资源服务器。
 */
@SpringBootApplication
@EnableEurekaClient
@EnableResourceServer
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }
}
