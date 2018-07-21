package com.wnf.myrule;

import com.netflix.loadbalancer.*;
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
        return new RetryRule();//重试？重试失败！！！！
//        return new RandomRule_ZY();// 我自定义为每台机器5次
//        return new AvailabilityFilteringRule();//优先过滤故障、断路、超过阈值的服务，剩余服务轮循访问
//        return new BestAvailableRule();//优先过滤掉由于多次访问故障而断路的服务，选择并发量最小的服务
    }
}
