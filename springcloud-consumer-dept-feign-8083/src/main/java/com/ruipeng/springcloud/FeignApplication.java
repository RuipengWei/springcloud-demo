package com.ruipeng.springcloud;

import com.ruipeng.rule.MyRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @program: myDemo.com.ruipeng.springcloud.FeignApplication
 * @description:
 * @author: Ruipeng
 * @create: 2020/6/8 11:09
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@RibbonClient(name = "springcloud-provider-dept", configuration = MyRule.class)
public class FeignApplication {
    public static void main(String[] args) {
        SpringApplication.run(FeignApplication.class, args);
    }
}
