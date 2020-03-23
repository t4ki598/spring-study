package com.ldr.demo3;

/**
 * 项目名称：spring-study
 * 类 名 称：Client
 * 类 描 述：TODO
 * 创建时间：2020-02-25 15:25
 * 创 建 人：t4ki
 */
public class Client {
    public static void main(String[] args) {
        //真实角色
        Host host = new Host();

        //代理角色
        ProxyInvocationHandler pih = new ProxyInvocationHandler();

        //通过调用程序处理角色来处理我们要调用的接口对象
        pih.setRent(host);
        //这里的proxy是动态生成的。我们并没有写
        Rent proxy = (Rent) pih.getProxy();
        proxy.rent();
    }
}
