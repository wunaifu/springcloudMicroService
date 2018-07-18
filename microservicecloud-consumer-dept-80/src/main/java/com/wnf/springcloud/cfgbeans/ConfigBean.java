package com.wnf.springcloud.cfgbeans;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RetryRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Created by wunaifu on 2018/7/18.
 */


//原来applicationContext.xml下的配置移交到这个Bean下，注解实现
@Configuration
public class ConfigBean //boot -->spring   applicationContext.xml --- @Configuration配置   ConfigBean = applicationContext.xml
{
    @Bean
    //@LoadBalanced//Spring Cloud Ribbon是基于Netflix Ribbon实现的一套客户端       负载均衡的工具。
    //RestTemplate提供了多种便捷访问远程http服务的方法，
    //是一种简单便捷的访问restful服务模版类，是spring提供的用于访问Rest服务的客户端模版工具集
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

//    @Bean
//    public IRule myRule()
//    {
//        //return new RoundRobinRule();
//        //return new RandomRule();//达到的目的，用我们重新选择的随机算法替代默认的轮询。
//        return new RetryRule();
//    }
}


//@Bean
//public UserServcie getUserServcie()
//{
//	return new UserServcieImpl();
//}
// applicationContext.xml == ConfigBean(@Configuration)
//<bean id="userServcie" class="com.atguigu.tmall.UserServiceImpl">
