package com.dao.bean;

import sun.security.util.AuthResources_it;

import java.sql.PreparedStatement;

public class Teacher {
    private String name;
    private String sex;
    private int age;


    public void getName() {
        System.out.println("My name is "+name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void getSex() {
        System.out.println("I'm "+sex);
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void getAge() {
        System.out.println("I'm "+age+" years old.");
    }

    public void setAge(int age) {
        this.age = age;
    }
}
