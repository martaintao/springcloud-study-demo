package com.martain.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Martin
 * @version 1.0
 * @date 2020/4/27 3:44 下午
 */
@SpringBootApplication
@EnableEurekaClient
public class EurekaConsumerApplication8082 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaConsumerApplication8082.class,args);
    }
}
