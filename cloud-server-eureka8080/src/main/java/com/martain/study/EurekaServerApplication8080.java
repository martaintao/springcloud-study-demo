package com.martain.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author Martin
 * @version 1.0
 * @date 2020/4/27 10:45 上午
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication8080 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication8080.class,args);
    }
}
