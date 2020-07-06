package com.martain.rule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Martin
 * @version 1.0
 * @date 2020/6/17 6:51 下午
 */
@Configuration
public class CustomRule {
    /**
     * 定义为随机规则
     * @return
     */
    @Bean
    public IRule randomRule(){
        return new RandomRule();
    }
}
