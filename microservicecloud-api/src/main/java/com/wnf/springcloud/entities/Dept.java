package com.wnf.springcloud.entities;


import com.sun.istack.internal.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @NoArgsConstructor: 自动生成无参数构造函数。
 * @AllArgsConstructor: 自动生成全参数构造函数。同时如果变量使用了@NotNull,会进行是否为空的校验@NonNull: 可以帮助我们避免空指针。
 * @Data: 自动为所有字段添加@ToString, @EqualsAndHashCode, @Getter方法，为非final字段添加@Setter,和@RequiredArgsConstructor!
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Accessors(chain=true)
public class Dept implements Serializable {

    //@NotNull
    private Long 	deptno; // 主键
    private String 	dname; // 部门名称
    private String 	db_source;// 来自那个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库

    public Dept(String dname) {
        super();
        this.dname = dname;
    }

//    public static void main(String[] args) {
//        Dept dept = new Dept();
//        dept.setDeptno(null).setDname("name").setDb_source("sss");
//        System.out.println(dept.getDeptno());
//    }

}
