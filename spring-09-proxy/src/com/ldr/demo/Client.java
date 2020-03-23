package com.ldr.demo;

/**
 * 项目名称：spring-study
 * 类 名 称：Client
 * 类 描 述：TODO
 * 创建时间：2020-02-24 17:39
 * 创 建 人：t4ki
 */
public class Client {
    public static void main(String[] args) {
//      房东租房子
        Host host = new Host();

//        代理 帮房东租房子
//代理一般会有属于自己的附属操作
        Proxy proxy = new Proxy(host);
        proxy.rent();
    }
}
