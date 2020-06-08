package com.ruipeng.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @program: myDemo.com.ruipeng.springcloud.EurekaServer7003
 * @description:
 * @author: Ruipeng
 * @create: 2020/6/3 14:45
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServer7003 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer7003.class, args);
    }
}
