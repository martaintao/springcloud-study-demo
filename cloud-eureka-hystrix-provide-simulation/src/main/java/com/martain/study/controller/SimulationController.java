package com.martain.study.controller;

import com.martain.study.service.SimulationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Martin
 * @version 1.0
 * @date 2020/6/20 3:08 下午
 */
@RestController
public class SimulationController {

    @Autowired
    SimulationService simulationService;


    @GetMapping("/simulation/hystrix/success/{id}")
    public String simulationSuccess(@PathVariable String id){
        String simulationSuccess = simulationService.simulationSuccess(id);
        return simulationSuccess;
    }

    @GetMapping("/simulation/hystrix/timeout/{id}")
    public String simulationTimeOut(@PathVariable String id){
        String simulationTimeOut = simulationService.simulationTimeOut(id);
        return simulationTimeOut;
    }

    /**
     * 服务熔断测试
     * @param id
     * @return
     */
    @GetMapping("/simulation/hystrix/circuitBreaker/{id}")
    public String simulationCircuitBreaker(@PathVariable Integer id){
        String simulationCircuitBreaker = simulationService.simulationCircuitBreaker(id);
        return simulationCircuitBreaker;
    }

}
