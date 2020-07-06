package com.martain.study.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author Martin
 * @version 1.0
 * @date 2020/6/20 3:30 下午
 */
@Component
@FeignClient(value = "cloud-eureka-provide-userinfo-service",fallback = SimulationServiceFallBack.class)
public interface SimulationService {

    @GetMapping("/simulation/hystrix/success/{id}")
    String simulationSuccess(@PathVariable("id") String id);

    @GetMapping("/simulation/hystrix/timeout/{id}")
    String simulationTimeOut(@PathVariable("id") String id);

}
