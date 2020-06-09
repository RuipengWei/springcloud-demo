package com.ruipeng.springcloud;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

/**
 * @program: myDemo.com.ruipeng.springcloud.SpringCloud8001
 * @description:
 * @author: Ruipeng
 * @create: 2020/6/2 17:11
 */
@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker
public class SpringCloud8004 {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloud8004.class, args);
    }

    @Bean
    public ServletRegistrationBean hystrixMetricsStreamServlet() {
        ServletRegistrationBean bean = new ServletRegistrationBean(new HystrixMetricsStreamServlet());
        bean.addUrlMappings("/actuator/hystrix.stream");
        return bean;
    }
}
