package com.ldr.demo4;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 项目名称：spring-study
 * 类 名 称：ProxyInvocationHandler
 * 类 描 述：TODO
 * 创建时间：2020-02-28 10:19
 * 创 建 人：t4ki
 */
public class ProxyInvocationHandler implements InvocationHandler{
    //被代理的接口
    private Object target;

    public void setTarget(Object target) {
        this.target = target;
    }

    //生成得到代理类
    public Object getProxy() {
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), target.getClass().getInterfaces(), this::invoke);
    }


    //处理代理实例，并返回代理结果
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        log(method.getName());
//        动态代理的本质，就是使用反射机制实现
        Object result = method.invoke(target, args);
        return result;
    }

    public void log(String msg){
        System.out.println("执行了" + msg + "方法");
    }

}

