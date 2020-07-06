package com.martain.study.controller;

import com.martain.study.common.response.BaseResponse;
import org.springframework.http.ResponseEntity;
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
@RequestMapping("/user")
public class UserAdminController {
    @Resource
    RestTemplate restTemplate;

    String URL_PREFIX = "http://cloud-consul-provide-userinfo-service";

    @GetMapping("/getUser/{userId}")
    public BaseResponse getUser(@PathVariable String userId){
        ResponseEntity<BaseResponse> forEntity = restTemplate.getForEntity(URL_PREFIX+"/user/getUserById/" + userId, BaseResponse.class);
        return forEntity.getBody() ;
    }
}
