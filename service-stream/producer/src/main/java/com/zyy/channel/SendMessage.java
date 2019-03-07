package com.zyy.channel;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.SubscribableChannel;

public interface SendMessage {
    @Output("my_msg")
    SubscribableChannel sendMsg();
}
