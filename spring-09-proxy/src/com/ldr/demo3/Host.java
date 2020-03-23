package com.ldr.demo3;

/**
 * 项目名称：spring-study
 * 类 名 称：Host
 * 类 描 述：TODO
 * 创建时间：2020-02-25 10:53
 * 创 建 人：t4ki
 */
public class Host implements Rent{
    @Override
    public void rent() {
        System.out.println("房东租房子");
    }
}
