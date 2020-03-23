package com.ldr.pojo;

/**
 * 项目名称：spring-study
 * 类 名 称：Dog
 * 类 描 述：TODO
 * 创建时间：2020-02-23 20:09
 * 创 建 人：t4ki
 */
public class Dog {
    private String name;
    public void say(){
        System.out.println("bark");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
