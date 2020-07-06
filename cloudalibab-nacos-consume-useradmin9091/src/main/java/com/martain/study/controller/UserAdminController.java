package com.martain.study.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author Martin
 * @version 1.0
 * @date 2020/4/24 4:44 下午
 */
@RestController
@RequestMapping("/consume")
public class UserAdminController {
    @Resource
    RestTemplate restTemplate;

    String URL_PREFIX = "http://nacos-provide-userinfo";

    @GetMapping("/echo")
    public String getUser(){
        return restTemplate.getForObject(URL_PREFIX+"/echo", String.class);
    }

}
