package com.ruipeng.springcloud.service;

import com.ruipeng.springcloud.dao.DeptDao;
import com.ruipeng.springcloud.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: myDemo.com.ruipeng.springcloud.service.DeptServiceImpl
 * @description:
 * @author: Ruipeng
 * @create: 2020/6/2 17:04
 */
@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptDao deptDao;

    @Override
    public boolean addDept(Dept dept) {
        return deptDao.addDept(dept);
    }

    @Override
    public Dept queryById(Long id) {
        return deptDao.queryById(id);
    }

    @Override
    public List<Dept> queryAll() {
        return deptDao.queryAll();
    }
}
