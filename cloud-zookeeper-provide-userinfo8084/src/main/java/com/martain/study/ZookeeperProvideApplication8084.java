package com.martain.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Martin
 * @version 1.0
 * @date 2020/6/16 10:18 上午
 */
@SpringBootApplication
@EnableDiscoveryClient // 该注解用于向使用zookeeper或consul作为注册中心时注册服务
public class ZookeeperProvideApplication8084 {
    public static void main(String[] args) {
        SpringApplication.run(ZookeeperProvideApplication8084.class,args);
    }
}
