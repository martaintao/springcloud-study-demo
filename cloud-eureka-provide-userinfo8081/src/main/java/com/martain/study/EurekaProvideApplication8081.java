package com.martain.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Martin
 * @version 1.0
 * @date 2020/4/24 2:08 下午
 */
@EnableDiscoveryClient
@SpringBootApplication
@ComponentScan("com.martain")
public class EurekaProvideApplication8081 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaProvideApplication8081.class,args);
    }
}
