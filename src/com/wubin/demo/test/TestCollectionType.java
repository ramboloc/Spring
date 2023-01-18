package com.wubin.demo.test;

import com.wubin.demo.CollectionType.Student;
import com.wubin.demo.Service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCollectionType {

    @Test
    public void testAdd(){
        // 1 加载Spring配置文件

        ApplicationContext context=
                new ClassPathXmlApplicationContext("bean4.xml");

        // 2 获取配置创建的对象

        Student student =context.getBean("student", Student.class);

        student.print();

    }
}
