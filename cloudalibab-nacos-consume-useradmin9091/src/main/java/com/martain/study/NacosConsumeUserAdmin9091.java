package com.martain.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Martin
 * @version 1.0
 * @date 2020/6/30 2:45 下午
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosConsumeUserAdmin9091 {
    public static void main(String[] args) {
        SpringApplication.run(NacosConsumeUserAdmin9091.class,args);
    }
}
