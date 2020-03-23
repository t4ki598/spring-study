package com.ldr.service;

/**
 * 项目名称：spring-study
 * 类 名 称：UserServiceImpl
 * 类 描 述：TODO
 * 创建时间：2020-02-28 11:06
 * 创 建 人：t4ki
 */
public class UserServiceImpl implements UserService {
    public void add() {
        System.out.println("增加了一个用户");
    }

    public void delete() {
        System.out.println("删除了一个用户");
    }

    public void update() {
        System.out.println("修改了一个用户");
    }

    public void query() {
        System.out.println("查找了一个用户");
    }
}
