package com.zyy;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 * @create 2019/3/4
 * @since 1.0.0
 */
@SpringBootApplication
@EnableApolloConfig
@RestController
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }

    @Value("${user_name:apollo}")
    private String userName;

    @GetMapping("/")
    public String show(){
        return userName;
    }

}
