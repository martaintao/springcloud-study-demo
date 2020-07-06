package com.martain.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Martin
 * @version 1.0
 * @date 2020/6/16 11:03 上午
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ZookeeperConsumeApplication8085 {

    public static void main(String[] args) {
        SpringApplication.run(ZookeeperConsumeApplication8085.class,args);
    }

}
