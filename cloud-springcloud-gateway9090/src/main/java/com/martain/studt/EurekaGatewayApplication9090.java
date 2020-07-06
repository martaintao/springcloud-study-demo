package com.martain.studt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Martin
 * @version 1.0
 * @date 2020/6/22 11:02 上午
 */
@SpringBootApplication
@EnableEurekaClient
public class EurekaGatewayApplication9090 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaGatewayApplication9090.class,args);
    }
}
