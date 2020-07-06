package com.martain.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Martin
 * @version 1.0
 * @date 2020/6/22 9:18 下午
 */
@EnableEurekaClient
@SpringBootApplication
public class ConfigClientApplication7001 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigClientApplication7001.class,args);
    }
}
