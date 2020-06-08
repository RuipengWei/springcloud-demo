package com.ruipeng.springcloud.service;

import com.ruipeng.springcloud.pojo.Dept;

import java.util.List;

/**
 * @program: myDemo.com.ruipeng.springcloud.service.DeptService
 * @description:
 * @author: Ruipeng
 * @create: 2020/6/2 17:04
 */
public interface DeptService {
    boolean addDept(Dept dept);

    Dept queryById(Long id);

    List<Dept> queryAll();
}
