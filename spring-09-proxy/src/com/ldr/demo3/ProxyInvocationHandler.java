package com.ldr.demo3;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 项目名称：spring-study
 * 类 名 称：ProxyInvocationHander
 * 类 描 述：使用这个类，自动生成代理类
 * 创建时间：2020-02-25 10:55
 * 创 建 人：t4ki
 */
public class ProxyInvocationHandler implements InvocationHandler {
    //被代理的接口
    private Rent rent;

    public void setRent(Rent rent) {
        this.rent = rent;
    }

    //生成得到代理类
    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), rent.getClass().getInterfaces(),this::invoke);
    }


    //处理代理实例，并返回代理结果
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//        动态代理的本质，就是使用反射机制实现
        Object result = method.invoke(rent, args);
        return result;
    }

    public void seeHouse(){
        System.out.println("看房子");
    }

    public void fee(){
        System.out.println("收中介费");
    }
}
