package com.martain.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Martin
 * @version 1.0
 * @date 2020/6/22 5:21 下午
 */
@SpringBootApplication
@EnableEurekaClient
@EnableConfigServer
public class ConfigCenterApplication7070 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigCenterApplication7070.class,args);
    }
}
