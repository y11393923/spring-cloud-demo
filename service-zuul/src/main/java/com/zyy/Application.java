package com.zyy;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.filters.ZuulProperties;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import springfox.documentation.swagger.web.SwaggerResource;
import springfox.documentation.swagger.web.SwaggerResourcesProvider;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Administrator
 * @create 2019/2/26
 * @since 1.0.0
 */
@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
@EnableDiscoveryClient
@EnableSwagger2Doc
public class Application {
    @Autowired
    ZuulProperties properties;

    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }

    @Component
    @Primary
    class DocumentationConfig implements SwaggerResourcesProvider{
        @Override
        public List<SwaggerResource> get() {
            List resouces=new ArrayList<>();
            properties.getRoutes().values().stream()
                    .forEach(route ->
                            resouces.add(swaggerResource(route.getServiceId(), route.getPath().replace("**", "v2/api-docs"), "2.0")));
            /*resouces.add(swaggerResource("eureka-client","/eureka-client/v2/api-docs","1.0"));
            resouces.add(swaggerResource("service-swagger","/service-swagger/v2/api-docs","1.0"));*/
            return resouces;
        }

        private SwaggerResource swaggerResource(String name,String location,String version){
            SwaggerResource swaggerResource=new SwaggerResource();
            swaggerResource.setName(name);
            swaggerResource.setLocation(location);
            swaggerResource.setSwaggerVersion(version);
            return swaggerResource;
        }
    }
}
