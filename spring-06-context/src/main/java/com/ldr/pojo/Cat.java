package com.ldr.pojo;

/**
 * 项目名称：spring-study
 * 类 名 称：Cat
 * 类 描 述：TODO
 * 创建时间：2020-02-23 20:08
 * 创 建 人：t4ki
 */
public class Cat {
    private String name;
    public void say(){
        System.out.println("miao");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
