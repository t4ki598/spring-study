package com.ldr.demo4;

import com.ldr.demo2.UserService;
import com.ldr.demo2.UserServiceImpl;

/**
 * 项目名称：spring-study
 * 类 名 称：Client
 * 类 描 述：TODO
 * 创建时间：2020-02-28 10:24
 * 创 建 人：t4ki
 */
public class Client {
    public static void main(String[] args) {
        //真是角色
        UserServiceImpl userService = new UserServiceImpl();
        //代理角色，不存在
        ProxyInvocationHandler pih = new ProxyInvocationHandler();

        //设置要代理的对象
        pih.setTarget(userService);

        //动态生成代理类
        UserService proxy =(UserService) pih.getProxy();

        proxy.delete();
    }

}
