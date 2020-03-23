package com.ldr.demo2;

/**
 * 项目名称：spring-study
 * 类 名 称：Client
 * 类 描 述：TODO
 * 创建时间：2020-02-25 10:24
 * 创 建 人：t4ki
 */
public class Client {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        UserServiceProxy proxy = new UserServiceProxy();
        proxy.setUserService(userService);
        proxy.add();
    }
}
