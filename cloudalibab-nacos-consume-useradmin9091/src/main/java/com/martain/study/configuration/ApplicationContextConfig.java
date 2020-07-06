package com.martain.study.configuration;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author Martin
 * @version 1.0
 * @date 2020/4/24 4:48 下午
 */
@Configuration
public class ApplicationContextConfig {

    @Bean
    @LoadBalanced  // 没有加这个的话没有办法使用服务名来调用接口
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

}
