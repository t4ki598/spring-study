package com.ldr.pojo;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * 项目名称：spring-study
 * 类 名 称：Person
 * 类 描 述：TODO
 * 创建时间：2020-02-23 20:09
 * 创 建 人：t4ki
 */
public class Person {

//    @Autowired 可以直接在属性上使用，也可以在set方式上使用。
//    使用autowire可以不用编写set方法
//    前提是被自动装配的属性在IOC容器中存在，且符合名字byname

    private String name;
    @Autowired(required = false)
    private Cat cat;
    @Autowired
    private Dog dog;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", cat=" + cat.getName() +
                ", dog=" + dog +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }
}
