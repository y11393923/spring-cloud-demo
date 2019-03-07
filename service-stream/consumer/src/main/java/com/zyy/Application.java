package com.zyy;

import com.zyy.channel.ReadMessage;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @author Administrator
 * @create 2019/3/7
 * @since 1.0.0
 */
@SpringBootApplication
@EnableBinding({ReadMessage.class})
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }

    @Component
    class consumer{
        @Value("${server.port}")
        String port;

        @StreamListener("my_msg")
        public void listener(String msg){
            System.out.println("消费者获取生产消息:" + msg+"，端口为:"+port);
        }
    }

}
