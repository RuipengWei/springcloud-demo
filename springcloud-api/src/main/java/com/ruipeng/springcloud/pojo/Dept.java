package com.ruipeng.springcloud.pojo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @program: myDemo.com.ruipeng.springcloud.pojo.Dept
 * @description:
 * @author: Ruipeng
 * @create: 2020/6/2 16:42
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@Accessors(chain = true)
public class Dept implements Serializable {
    private static final long serialVersionUID = -2798754505241905753L;
    private Long deptno;
    private String dname;
    private String db_source;

    public Dept(String dname) {
        this.dname = dname;
    }
}
