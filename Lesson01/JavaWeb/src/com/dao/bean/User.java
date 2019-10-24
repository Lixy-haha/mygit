package com.dao.bean;

public class User {
    private String name;
    private String sex;


    public void getName() {
        //return name;
        System.out.println("My name is "+name);
    }

    public void setName(String name) {

        this.name = name;
    }

    public void getSex() {
        System.out.println("I'm " + sex);
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void init(){
        System.out.println("Bean is going through init.");
    }

    public void destroy(){
        System.out.println("Bean will destroy now.");
    }
}
