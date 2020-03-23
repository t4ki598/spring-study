package com.ldr.pojo;

/**
 * 项目名称：spring-study
 * 类 名 称：ExampleBean
 * 类 描 述：TODO
 * 创建时间：2020-02-19 09:45
 * 创 建 人：t4ki
 */
public class ExampleBean {
    private int years;
    private String answer;

    public ExampleBean(int years, String answer) {
        this.years = years;
        this.answer = answer;
    }

    public void show(){
        System.out.println("years = " + this.years + ", answer = " + this.answer );
    }
}
