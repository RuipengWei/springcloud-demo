package com.ruipeng.springcloud;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: myDemo.com.ruipeng.springcloud.ConfigClientApplication
 * @description:
 * @author: Ruipeng
 * @create: 2020/6/14 17:42
 */
@SpringBootApplication
@RestController
@EnableEurekaClient
@RefreshScope
public class ConfigClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigClientApplication.class, args);
    }

    @Value("${server.port}")
    private String port;

    @Value("${spring.application.name}")
    private String name;

    @Value("${foo.version}")
    private String version;

    @GetMapping("/info")
    public String info() {
        return "port:" + port + "\t" + "name:" + name + "\t" + "version:" + version;
    }

}

