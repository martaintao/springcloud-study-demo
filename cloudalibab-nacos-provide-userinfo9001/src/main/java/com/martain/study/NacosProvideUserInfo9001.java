package com.martain.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Martin
 * @version 1.0
 * @date 2020/6/30 2:12 下午
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosProvideUserInfo9001 {
    public static void main(String[] args) {
        SpringApplication.run(NacosProvideUserInfo9001.class,args);
    }
}
