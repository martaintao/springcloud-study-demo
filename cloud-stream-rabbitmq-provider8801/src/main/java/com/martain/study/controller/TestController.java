package com.martain.study.controller;

import com.martain.study.service.IMessageProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author Martin
 * @version 1.0
 * @date 2020/6/29 2:27 下午
 */
@RestController
public class TestController {

    @Autowired
    IMessageProvider messageProvider;

    @GetMapping("/sendMsg")
    public String sendMsg(){
        String msg = UUID.randomUUID().toString();
        return messageProvider.send(msg);
    }


}
