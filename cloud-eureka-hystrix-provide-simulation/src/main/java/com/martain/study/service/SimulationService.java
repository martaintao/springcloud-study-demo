package com.martain.study.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;

import java.util.UUID;
import java.util.concurrent.TimeUnit;

/**
 * @author Martin
 * @version 1.0
 * @date 2020/6/20 2:59 下午
 */
@Service
public class SimulationService {

    /**
     * 模拟正常、迅速的服务
     * @param id
     * @return
     */
    public String simulationSuccess(String id) {
        return "thread:" + Thread.currentThread().getName() + " success:" + id;
    }

    /**
     * 模拟耗时的服务
     * @param id
     * @return
     */
    @HystrixCommand(
            /**
             * 绑定兜底方法 timeoutHandle
            */
            fallbackMethod = "timeoutHandle",commandProperties = {
            /**
             * 下面这个指定的是超时阈值
             */
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "3000")
    })
    public String simulationTimeOut(String id) {
        int timeout = 5;
        try {
            TimeUnit.SECONDS.sleep(timeout);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "thread:" + Thread.currentThread().getName() + " timeout:" + timeout;
    }

    /**
     * 兜底的方法，请求超时或者出现异常都会跳转到这个方法
     * @param id
     * @return
     */
    public String timeoutHandle(String id){
        return "thread:" + Thread.currentThread().getName() + "  request fail, id:" + id;
    }


    /**
     * 下面是服务熔断测试方法
     * @param id
     * @return
     */
    @HystrixCommand(fallbackMethod = "circuitBreakerFallBack",commandProperties = {
        @HystrixProperty(name = "circuitBreaker.enabled",value = "true"), // 是否开启断路器
        @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold",value = "10"), // 并发超过多少的时候开启断路器
        @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds",value = "10000"), // 时间窗口期
        @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage",value = "60")  // 失败率达到60%的时候开启熔断
    })
    public String simulationCircuitBreaker(Integer id){
        if (id<0){
            throw new RuntimeException("id 必须大于等于 0");
        }
        return "simulationCircuitBreaker:"+ UUID.randomUUID().toString();
    }

    /**
     * 兜底方法
     * @param id
     * @return
     */
    public String circuitBreakerFallBack(Integer id){
        return "circuitBreakerFallBack:"+ UUID.randomUUID().toString();
    }


}
