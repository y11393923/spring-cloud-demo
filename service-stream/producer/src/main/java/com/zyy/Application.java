package com.zyy;

import com.zyy.channel.SendMessage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

/**
 * @author Administrator
 * @create 2019/3/7
 * @since 1.0.0
 */
@SpringBootApplication
@EnableBinding({SendMessage.class})
public class Application {
    /**
     * 如果启动出现警告：Connection to node 0 could not be established. Broker may not be available.
     * 解决办法：将kafka配置文件advertised.listeners注释打开，把your.host.name换成服务器ip
     * @param args
     */

    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
