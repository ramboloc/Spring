package com.wubin.demo;

public class User {

    private String userName;
    //有参构造法
    public User(String userName) {
        this.userName = userName;
    }
    // 无参构造法
    public User() {
    }

    public void add(){

        System.out.println("add something...");
    }
}
