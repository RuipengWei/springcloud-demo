package com.ruipeng.springcloud.dao;

import com.ruipeng.springcloud.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @program: myDemo.com.ruipeng.springcloud.dao.DeptDao
 * @description:
 * @author: Ruipeng
 * @create: 2020/6/2 16:59
 */
@Mapper
@Repository
public interface DeptDao {
    boolean addDept(Dept dept);

    Dept queryById(Long id);

    List<Dept> queryAll();
}
