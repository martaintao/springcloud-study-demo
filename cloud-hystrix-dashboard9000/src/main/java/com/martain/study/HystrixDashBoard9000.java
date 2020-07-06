package com.martain.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author Martin
 * @version 1.0
 * @date 2020/6/21 1:00 下午
 */
@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashBoard9000 {
    public static void main(String[] args) {
        SpringApplication.run(HystrixDashBoard9000.class,args);
    }
}
