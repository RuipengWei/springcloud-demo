package com.ruipeng.springcloud.controller;

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
 * @create: 2020/6/8 11:08
 */
@RestController
public class DeptController {
    @Autowired
    private DeptService deptService;

    @PostMapping("/dept")
    public boolean addDept(Dept dept) {
        return deptService.addDept(dept);
    }

    @GetMapping("/dept/{id}")
    public Dept dept(@PathVariable("id") Long id) {
        return deptService.getById(id);
    }

    @GetMapping("/depts")
    public List<Dept> depts() {
        return deptService.getAll();
    }
}
