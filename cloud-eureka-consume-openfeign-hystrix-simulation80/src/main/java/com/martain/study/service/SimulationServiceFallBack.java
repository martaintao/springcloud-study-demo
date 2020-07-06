package com.martain.study.service;

import org.springframework.stereotype.Component;

/**
 * @author Martin
 * @version 1.0
 * @date 2020/6/21 2:36 上午
 */
@Component
public class SimulationServiceFallBack implements SimulationService {
    @Override
    public String simulationSuccess(String id) {
        return "---simulationSuccess fail-----";
    }

    @Override
    public String simulationTimeOut(String id) {
        return "---simulationTimeOut fail-----";
    }
}
