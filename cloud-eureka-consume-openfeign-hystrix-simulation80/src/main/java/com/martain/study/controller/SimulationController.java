package com.martain.study.controller;

import com.martain.study.service.SimulationService;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Martin
 * @version 1.0
 * @date 2020/6/20 3:33 下午
 */
@RestController
@DefaultProperties(defaultFallback = "globalHandle")
public class SimulationController {

    @Autowired
    SimulationService simulationService;

    @GetMapping("/consume/hystrix/success/{id}")
    @HystrixCommand
    public String simulationSuccess(@PathVariable String id){
        String simulationSuccess = simulationService.simulationSuccess(id);
        return simulationSuccess;
    }
    @GetMapping("/consume/hystrix/timeout/{id}")
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
    public String simulationTimeOut(@PathVariable String id){
        String simulationTimeOut = simulationService.simulationTimeOut(id);
        return simulationTimeOut;
    }

    /**
     * 兜底方法，异常或者超时都会触发该方法
     * @param id
     * @return
     */
    public String timeoutHandle(String id){
        return "thread:" + Thread.currentThread().getName() + "  request fail, id:" + id;
    }

    /**
     * 全局服务降级兜底的方法
     * @param id
     * @return
     */
    public String globalHandle(String id){
        return "thread:" + Thread.currentThread().getName() + "  globalHandle, id:" + id;
    }

}
