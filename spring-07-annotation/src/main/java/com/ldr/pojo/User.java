package com.ldr.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * 项目名称：spring-study
 * 类 名 称：User
 * 类 描 述：TODO
 * 创建时间：2020-02-23 21:23
 * 创 建 人：t4ki
 */

@Component
//Componet英文译为组件
//等价于 <bean id = "user" class = "com.ldr.pojo.User" />
@Scope("singleton ")
public class User {

    @Value("t4ki")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
