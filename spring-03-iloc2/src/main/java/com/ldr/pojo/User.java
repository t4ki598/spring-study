package com.ldr.pojo;

/**
 * 项目名称：spring-study
 * 类 名 称：User
 * 类 描 述：TODO
 * 创建时间：2020-02-18 17:15
 * 创 建 人：t4ki
 */
public class User {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println("name:" + name);
    }
}
