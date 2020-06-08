package com.ruipeng.springcloud.service;

import com.ruipeng.springcloud.pojo.Dept;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

/**
 * @program: myDemo.com.ruipeng.springcloud.service.DeptService
 * @description:
 * @author: Ruipeng
 * @create: 2020/6/8 11:04
 */
@FeignClient("springcloud-provider-dept")
public interface DeptService {
    @PostMapping("/dept")
    boolean addDept(Dept dept);

    @GetMapping("/dept/{id}")
    Dept getById(@PathVariable("id") Long id);

    @GetMapping("/depts")
    List<Dept> getAll();
}
