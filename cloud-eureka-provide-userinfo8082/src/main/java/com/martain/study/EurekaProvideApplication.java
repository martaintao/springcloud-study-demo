package com.martain.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Martin
 * @version 1.0
 * @date 2020/6/17 4:33 下午
 */
@EnableDiscoveryClient
@SpringBootApplication
@ComponentScan("com.martain")
public class EurekaProvideApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaProvideApplication.class,args);
    }
}
