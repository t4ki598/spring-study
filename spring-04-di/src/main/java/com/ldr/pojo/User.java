package com.ldr.pojo;

/**
 * 项目名称：spring-study
 * 类 名 称：User
 * 类 描 述：TODO
 * 创建时间：2020-02-22 17:01
 * 创 建 人：t4ki
 */
public class User {
    private String name;
    private int id;

    public User(String name, int id) {
        this.name = name;
        this.id = id;
    }


    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
