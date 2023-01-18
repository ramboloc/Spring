package com.wubin.demo.test;

import com.wubin.demo.Bean.Emp;
import com.wubin.demo.Service.UserService;
import com.wubin.demo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean {

    @Test
    public void testAdd(){
        // 1 加载Spring配置文件

        ApplicationContext context=
                new ClassPathXmlApplicationContext("bean2.xml");

        // 2 获取配置创建的对象

        UserService userService =context.getBean("userService", UserService.class);

        userService.add();

    }
    @Test
    public void testAdd2(){
        // 1 加载Spring配置文件

        ApplicationContext context=
                new ClassPathXmlApplicationContext("bean3.xml");

        // 2 获取配置创建的对象

        Emp emp =context.getBean("emp", Emp.class);

        emp.add();

    }
}
