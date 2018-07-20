package com.wnf.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by wunaifu on 2018/7/20.
 */
@Configuration
public class MySelfRule {

    @Bean
    public IRule myRule()
    {
//        return new RandomRule();// Ribbon默认是轮询，我自定义为随机
//        return new RoundRobinRule();// RoundRobinRuleRibbon默认是轮询，我自定义为随机

        return new RandomRule_ZY();// 我自定义为每台机器5次
    }
}
