package com.ldr.diy;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * 项目名称：spring-study
 * 类 名 称：AnnotationPointCut
 * 类 描 述：TODO
 * 创建时间：2020-02-28 20:58
 * 创 建 人：t4ki
 */

@Aspect
//标注这是一个切面
public class AnnotationPointCut{

    @Before("execution(* com.ldr.service.UserServiceImpl.*(..))")
    public void before(){
        System.out.println("注解aop方法执行前。");
    }
}
