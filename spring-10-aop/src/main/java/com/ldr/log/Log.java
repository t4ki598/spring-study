package com.ldr.log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * 项目名称：spring-study
 * 类 名 称：Log
 * 类 描 述：TODO
 * 创建时间：2020-02-28 16:05
 * 创 建 人：t4ki
 */
public class Log implements MethodBeforeAdvice {

    //method: 要执行的目标对象的方法
    //object: 参数
    //o:      目标对象
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println(o.getClass().getName() + "的" + method.getName() + "方法被执行了");
    }
}
