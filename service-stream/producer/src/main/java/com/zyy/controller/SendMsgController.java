package com.zyy.controller;

import com.zyy.channel.SendMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author Administrator
 * @create 2019/3/7
 * @since 1.0.0
 */
@RestController
public class SendMsgController {
    @Autowired
    private SendMessage sendMessage;

    @GetMapping("/")
    public String sendMsg(){
        String msg=UUID.randomUUID().toString();
        System.out.println("生产者发送内容msg:" + msg);
        Message biuld = MessageBuilder.withPayload(msg.getBytes()).build();
        sendMessage.sendMsg().send(biuld);
        return "success";
    }

}
