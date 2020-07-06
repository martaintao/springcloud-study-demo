package com.martain.study.service;

import com.martain.study.common.response.BaseResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author Martin
 * @version 1.0
 * @date 2020/6/18 10:20 上午
 */
@Component
@FeignClient(value = "CLOUD-EUREKA-PROVIDE-USERINFO-SERVICE")
public interface UserInfoService {

    @GetMapping("/user/sayHi")
    String sayHi();

    @GetMapping("/user/getUser/{userId}")
    BaseResponse getUser(@PathVariable("userId") String userId);

}
