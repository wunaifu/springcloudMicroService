package com.wnf.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by wunaifu on 2018/7/18.
 */

@SpringBootApplication
@EnableEurekaClient //本服务启动后会自动注册进eureka服务中
@EnableDiscoveryClient //服务发现
public class ConfigDeptProvider8001_App {

    public static void main(String[] args) {
        SpringApplication.run(ConfigDeptProvider8001_App.class, args);
    }

}