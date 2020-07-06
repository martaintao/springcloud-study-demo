package com.martain.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author Martin
 * @version 1.0
 * @date 2020/6/18 10:11 上午
 */
@SpringBootApplication
@EnableFeignClients
public class EurekaConsumeOpenFeignApplication80 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaConsumeOpenFeignApplication80.class,args);
    }
}
