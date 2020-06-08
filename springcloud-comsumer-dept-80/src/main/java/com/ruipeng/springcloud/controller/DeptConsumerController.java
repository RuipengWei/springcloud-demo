package com.ruipeng.springcloud.controller;

import com.ruipeng.springcloud.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @program: myDemo.com.ruipeng.springcloud.controller.DeptComsumerController
 * @description:
 * @author: Ruipeng
 * @create: 2020/6/2 17:41
 */
@RestController
public class DeptConsumerController {
    @Autowired
    private RestTemplate restTemplate;

    private static final String REST_URL_PREFIX = "http://SPRINGCLOUD-PROVIDER-DEPT";

    @PostMapping("/consumer/dept")
    public boolean add(Dept dept) {
        return restTemplate.postForObject(REST_URL_PREFIX + "/dept", dept, Boolean.class);
    }

    @GetMapping("/consumer/dept/{id}")
    public Dept get(@PathVariable("id") Long id) {
        return restTemplate.getForObject(REST_URL_PREFIX + "/dept/" + id, Dept.class);
    }

    @GetMapping("/consumer/depts")
    public List<Dept> getAll() {
        return restTemplate.getForObject(REST_URL_PREFIX + "/depts", List.class);
    }
}
