package com.ruipeng.springcloud.handler;

import com.ruipeng.springcloud.pojo.Dept;
import com.ruipeng.springcloud.service.DeptService;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @program: myDemo.com.ruipeng.springcloud.handler.DeptHystrixHandler
 * @description:
 * @author: Ruipeng
 * @create: 2020/6/9 14:24
 */
@Component
public class DeptHystrixHandler implements FallbackFactory {
    @Override
    public DeptService create(Throwable throwable) {
        return new DeptService() {
            @Override
            public boolean addDept(Dept dept) {
                return false;
            }

            @Override
            public Dept getById(Long id) {
                return new Dept()
                        .setDeptno(id)
                        .setDname("id=>" + id + "没有此用户，服务占不可用");
            }

            @Override
            public List<Dept> getAll() {
                return null;
            }
        };
    }
}
