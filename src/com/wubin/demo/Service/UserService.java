package com.wubin.demo.Service;

import com.wubin.demo.Dao.UserDao;
import com.wubin.demo.Dao.UserDaoImpl;

public class UserService {

    // 创建UserDao类型属性, 生成set方法
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add(){
        System.out.println("service add............");
//        // 原始方式
//        UserDao userDao=new UserDaoImpl();
        userDao.update();

    }

}
