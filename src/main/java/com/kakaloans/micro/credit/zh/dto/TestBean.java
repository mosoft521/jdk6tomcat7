package com.kakaloans.micro.credit.zh.dto;

import java.io.Serializable;

public class TestBean implements Serializable {

    private String name;
    private int age;

    public TestBean() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
