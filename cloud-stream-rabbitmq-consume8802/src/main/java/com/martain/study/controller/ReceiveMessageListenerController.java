package com.martain.study.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

/**
 * @author Martin
 * @version 1.0
 * @date 2020/6/29 3:40 下午
 */
@Component
@EnableBinding(Sink.class)
public class ReceiveMessageListenerController {

    /**
     * 获取本服务的端口
     */
    @Value("${server.port}")
    private String serverPort;

    /**
     * 这里表示监听sink的input
     * @param message
     */
    @StreamListener(Sink.INPUT)
    public void input(Message<String> message){
        System.out.println("**** recv msg :"+message.getPayload()+"   in port "+serverPort);
    }

}
