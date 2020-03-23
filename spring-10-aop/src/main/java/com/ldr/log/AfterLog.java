package com.ldr.log;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * 项目名称：spring-study
 * 类 名 称：AfterLog
 * 类 描 述：TODO
 * 创建时间：2020-02-28 16:11
 * 创 建 人：t4ki
 */
public class AfterLog implements AfterReturningAdvice  {

    //returnValue:返回值
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("返回了" + method.getName() + "方法， 返回结果为：" + returnValue);
    }
}
