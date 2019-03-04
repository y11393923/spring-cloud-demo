package com.zyy;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 * @create 2019/2/26
 * @since 1.0.0
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@RestController
@EnableHystrix
@EnableHystrixDashboard
@EnableCircuitBreaker
public class Application {

    /**
     * 访问地址 http://localhost:8002/actuator/hystrix.stream
     * @param args
     */

    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }

    @Value("${server.port}")
    public int port;

    @RequestMapping("/{name}")
    @HystrixCommand(fallbackMethod = "hiError")
    public String home(@PathVariable("name")String name) {
        return "hi "+name+" ,i am from port:" + port;
    }

    public String hiError(String name){
        return "hi,"+name+",sorry,error!";
    }

}
