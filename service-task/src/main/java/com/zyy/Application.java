package com.zyy;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.configuration.EnableTask;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Administrator
 * @create 2019/3/7
 * @since 1.0.0
 */
@SpringBootApplication
@EnableTask
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }

    @Component
    public static class TestCommandLineRunner implements CommandLineRunner{
        @Override
        public void run(String... args) throws Exception {
            System.out.println("this is a Test about spring cloud task.");
            //模拟异常
            /*try{
                List<String> list = new ArrayList<>();
                list.get(1);
            }catch (Exception e){
                System.out.println("Error");
                throw e;
            }*/
        }
    }
}
