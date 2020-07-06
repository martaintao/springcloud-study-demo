package com.martain.study.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author Martin
 * @version 1.0
 * @date 2020/6/30 2:14 下午
 */
@RestController
public class EchoController {

    @Value("${server.port}")
    String serverPort;


    @GetMapping("/echo")
    public String echo(){
        return "Hello serverPort : "+serverPort+" uuid :"+ UUID.randomUUID().toString();
    }

}
