package com.ruipeng.springcloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.ruipeng.springcloud.pojo.Dept;
import com.ruipeng.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
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

    @PostMapping("/dept")
    public boolean addDept(Dept dept) {
        return deptService.addDept(dept);
    }

    @HystrixCommand(fallbackMethod = "hystrixMethod")
    @GetMapping("/dept/{id}")
    public Dept queryById(@PathVariable("id") Long id) {
        return deptService.queryById(id);
    }

    @GetMapping("/depts")
    public List<Dept> queryAll() {
        return deptService.queryAll();
    }

    public Dept hystrixMethod(@PathVariable("id") Long id) {
        return new Dept().setDeptno(id)
                .setDname("id=>" + id + "没有对应信息，null")
                .setDb_source("no this database in MySQL");
    }
}
