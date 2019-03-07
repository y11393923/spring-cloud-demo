package com.zyy.channel;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface ReadMessage {

    @Input("my_msg")
    SubscribableChannel readMsg();
}
