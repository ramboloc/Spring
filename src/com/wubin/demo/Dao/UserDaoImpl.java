package com.wubin.demo.Dao;

public class UserDaoImpl implements UserDao{

    @Override
    public void add(){
        System.out.println("add something...");
    }

    @Override
    public void update() {
        System.out.println("Dao update");
    }


}
