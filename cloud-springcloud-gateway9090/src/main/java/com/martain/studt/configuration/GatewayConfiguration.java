package com.martain.studt.configuration;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Martin
 * @version 1.0
 * @date 2020/6/22 2:26 下午
 */
@Configuration
public class GatewayConfiguration {

//    @Bean
//    public RouteLocator customRouteLocator(RouteLocatorBuilder routeLocatorBuilder){
//        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
//        routes.route("host_route",r->r.path("/red/**").uri("https://example.org")).build();
//        return routes.build();
//    }
}
