package cn.learn.structs;

import com.opensymphony.xwork2.ActionSupport;

public class HelloWorldAction extends ActionSupport {

    private String name;


    public String excute() throws Exception{
        System.out.println("Inside action...");
        return "success";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }






}
