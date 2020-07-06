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
public class Application8090 {
    public static void main(String[] args) {
        SpringApplication.run(Application8090.class,args);
    }
}
