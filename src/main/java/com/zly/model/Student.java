package com.zly.model;

import java.math.BigDecimal;

/**
 * @author zhangliuyang
 * @email zhangliuyang@nggirl.com.cn
 * @date 2016/5/24  14:18
 */
public class Student {
    private Integer id;
    private String name;
    private Integer age;
    private BigDecimal weight;
    private BigDecimal height;

    public Student() {
    }

    public Student(Integer id, String name, Integer age, BigDecimal weight, BigDecimal height) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public BigDecimal getHeight() {
        return height;
    }

    public void setHeight(BigDecimal height) {
        this.height = height;
    }
}
