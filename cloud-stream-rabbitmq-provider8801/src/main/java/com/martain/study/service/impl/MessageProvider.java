package com.martain.study.service.impl;

import com.martain.study.service.IMessageProvider;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import javax.annotation.Resource;

/**
 * @author Martin
 * @version 1.0
 * @date 2020/6/29 1:38 下午
 */
@EnableBinding(Source.class)
public class MessageProvider implements IMessageProvider {
    /**
     * 注入消息发送管道
     */
    @Resource
    private MessageChannel output;

    @Override
    public String send(String msg) {
        output.send(MessageBuilder.withPayload(msg).build());
        System.out.println("******send message:"+msg);
        return msg;
    }
}
