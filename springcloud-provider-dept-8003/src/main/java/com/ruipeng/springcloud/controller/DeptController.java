package com.ruipeng.springcloud.controller;

import com.ruipeng.springcloud.pojo.Dept;
import com.ruipeng.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: myDemo.com.ruipeng.springcloud.controller.DeptController
 * @description:
 * @author: Ruipeng
 * @create: 2020/6/2 17:06
 */
@RestController
public class DeptController {
    @Autowired
    private DeptService deptService;

    @Autowired
    private DiscoveryClient discoveryClient;

    @PostMapping("/dept")
    public boolean addDept(Dept dept) {
        return deptService.addDept(dept);
    }

    @GetMapping("/dept/{id}")
    public Dept queryById(@PathVariable("id") Long id) {
        return deptService.queryById(id);
    }

    @GetMapping("/depts")
    public List<Dept> queryAll() {
        return deptService.queryAll();
    }

    @GetMapping("/discovery")
    public Object discovery() {
        List<String> services = discoveryClient.getServices();
        System.out.println("discovery=>service" + services);
        List<ServiceInstance> instances = discoveryClient.getInstances("springcloud-provider-dept");
        for (ServiceInstance instance : instances) {
            System.out.println(instance.getHost() + "\t" + instance.getPort() + "\t" + instance.getUri() + "\t" + instance.getServiceId());
        }
        return discoveryClient;
    }
}
