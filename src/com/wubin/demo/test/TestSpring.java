package com.wubin.demo.test;

import com.wubin.demo.Book;
import com.wubin.demo.Orders;
import com.wubin.demo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    @Test
    public void testAdd(){
        // 1 加载Spring配置文件

        ApplicationContext context=
                new ClassPathXmlApplicationContext("bean1.xml");

        // 2 获取配置创建的对象

        User user =context.getBean("user", User.class);

        System.out.println(user);
        user.add();

    }

    @Test
    public void testBook(){
        // 1 加载Spring配置文件

        ApplicationContext context=
                new ClassPathXmlApplicationContext("bean1.xml");

        // 2 获取配置创建的对象

        Book book =context.getBean("book", Book.class);

        book.testDemo();


    }

    @Test
    public void testOrder(){
        // 1 加载Spring配置文件

        ApplicationContext context=
                new ClassPathXmlApplicationContext("bean1.xml");

        // 2 获取配置创建的对象

        Orders order =context.getBean("orders", Orders.class);

        order.testDemo();


    }
}
