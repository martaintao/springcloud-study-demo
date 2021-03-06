package com.martain.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Martin
 * @version 1.0
 * @date 2020/6/16 5:22 下午
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConsulConsumeApplication8087 {
    public static void main(String[] args) {
        SpringApplication.run(ConsulConsumeApplication8087.class,args);
    }
}
