package com.ldr.demo;

/**
 * 项目名称：spring-study
 * 类 名 称：Proxy
 * 类 描 述：TODO
 * 创建时间：2020-02-24 17:45
 * 创 建 人：t4ki
 */
public class Proxy implements Rent {

    private Host host;

    public Proxy() {
    }

    public Proxy(Host host) {
        this.host = host;
    }

    public void rent() {
        seehouse();
        host.rent();
        hetong();
        fee();

    }

    public void seehouse(){
        System.out.println("看房");
    }

    public void hetong(){
        System.out.println("签租赁合同");
    }

    public void fee(){
        System.out.println("收中介费");
    }
}
