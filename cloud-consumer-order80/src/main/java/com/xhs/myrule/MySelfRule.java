package com.xhs.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MySelfRule {

    //ribbon访问规则
    @Bean
    public IRule ribbonRule() {
        return new RandomRule();
    }
}
