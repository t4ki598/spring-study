package com.ldr.pojo;

/**
 * 项目名称：spring-study
 * 类 名 称：Person
 * 类 描 述：TODO
 * 创建时间：2020-02-23 16:05
 * 创 建 人：t4ki
 */
public class Person {
    private String name;
    private Cat cat;
    private Dog dog;

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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", cat=" + cat +
                ", dog=" + dog +
                '}';
    }
}
