package com.martain.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author Martin
 * @version 1.0
 * @date 2020/6/20 3:27 下午
 */
@SpringBootApplication
@EnableFeignClients
@EnableHystrix
public class EurekaHystrixConsumeApplication80 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaHystrixConsumeApplication80.class,args);
    }
}
