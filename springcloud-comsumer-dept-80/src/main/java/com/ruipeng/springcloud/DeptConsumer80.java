package com.ruipeng.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @program: myDemo.com.ruipeng.springcloud.DeptConsumer80
 * @description:
 * @author: Ruipeng
 * @create: 2020/6/2 17:57
 */
@SpringBootApplication
@EnableEurekaClient
public class DeptConsumer80 {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer80.class, args);
    }
}
