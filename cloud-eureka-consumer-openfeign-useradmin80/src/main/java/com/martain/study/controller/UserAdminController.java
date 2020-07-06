package com.martain.study.controller;

import com.martain.study.common.response.BaseResponse;
import com.martain.study.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import javax.annotation.Resources;

/**
 * @author Martin
 * @version 1.0
 * @date 2020/4/24 4:44 下午
 */
@RestController
@RequestMapping("/user")
public class UserAdminController {

    @Resource
    UserInfoService userInfoService;

    @GetMapping("/getUser/{userId}")
    public BaseResponse getUser(@PathVariable String userId){
        return userInfoService.getUser(userId);
    }

    @GetMapping("/sayHi")
    public String sayHi(){
        return userInfoService.sayHi();
    }
}
