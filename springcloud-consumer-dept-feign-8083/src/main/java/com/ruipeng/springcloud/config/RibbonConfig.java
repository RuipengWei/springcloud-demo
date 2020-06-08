package com.ruipeng.springcloud.config;

import com.netflix.loadbalancer.IRule;
import com.ruipeng.rule.MyRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: myDemo.com.ruipeng.springcloud.config.RibbonConfig
 * @description:
 * @author: Ruipeng
 * @create: 2020/6/8 15:47
 */
@Configuration
public class RibbonConfig {
    @Bean
    public IRule rule() {
        return new MyRule();
    }
}
