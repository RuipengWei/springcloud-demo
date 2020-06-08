package com.ruipeng.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @program: myDemo.com.ruipeng.springcloud.SpringCloud8001
 * @description:
 * @author: Ruipeng
 * @create: 2020/6/2 17:11
 */
@SpringBootApplication
@EnableEurekaClient
public class SpringCloud8003 {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloud8003.class, args);
    }
}
