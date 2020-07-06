package com.martain.study;

import com.martain.rule.CustomRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.netflix.ribbon.RibbonClients;

/**
 * @author Martin
 * @version 1.0
 * @date 2020/6/17 4:27 下午
 */
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "CLOUD-EUREKA-PROVIDE-USERINFO-SERVICE",configuration = CustomRule.class)
public class EurekaConsumeApplication80 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaConsumeApplication80.class,args);
    }
}
