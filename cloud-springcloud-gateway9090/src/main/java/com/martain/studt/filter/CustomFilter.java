package com.martain.studt.filter;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * @author Martin
 * @version 1.0
 * @date 2020/6/22 3:11 下午
 */
@Component
public class CustomFilter implements GlobalFilter, Ordered {

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        /**
         * 从请求中获取是否有token参数
         */
        String token = exchange.getRequest().getQueryParams().getFirst("token");
        if (token==null){
            /**
             * 直接拒绝
             */
            exchange.getResponse().setStatusCode(HttpStatus.NOT_ACCEPTABLE);
            return exchange.getResponse().setComplete();
        }
        /**
         * 通过这个过滤器，进入过滤链中的下一个过滤器
         */
        return chain.filter(exchange);
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
