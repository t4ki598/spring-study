package com.ldr.pojo;

/**
 * 项目名称：spring-study
 * 类 名 称：Address
 * 类 描 述：TODO
 * 创建时间：2020-02-19 15:26
 * 创 建 人：t4ki
 */
public class Address {
    private String address;

    @Override
    public String toString() {
        return "Address{" +
                "address='" + address + '\'' +
                '}';
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
