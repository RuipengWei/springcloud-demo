package com.ruipeng.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @program: myDemo.com.ruipeng.springcloud.config.ConfigBean
 * @description:
 * @author: Ruipeng
 * @create: 2020/6/2 17:44
 */
@Configuration
public class ConfigBean {
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
