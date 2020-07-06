package com.martain.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Martin
 * @version 1.0
 * @date 2020/6/30 3:12 下午
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosConfigClient99 {
    public static void main(String[] args) {
        SpringApplication.run(NacosConfigClient99.class,args);
    }
}
