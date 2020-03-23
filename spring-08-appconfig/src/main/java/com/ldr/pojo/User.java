package com.ldr.pojo;

import org.springframework.beans.factory.annotation.Value;

/**
 * 项目名称：spring-study
 * 类 名 称：User
 * 类 描 述：TODO
 * 创建时间：2020-02-23 22:01
 * 创 建 人：t4ki
 */
public class User {
    @Value("t4ki")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
