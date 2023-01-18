package com.wubin.demo.CollectionType;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

// 注入数组的值
public class Student {
    // 1 数组类型属性
    private String[] courses;
    // 2 List集合类型属性
    private List<String> list;
    // 3 map集合类型属性
    private Map<String,String> map;

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    private List<Course> courseList;
    public void setList(List<String> list) {
        this.list = list;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public void print(){
        System.out.println(Arrays.toString(courses));
        System.out.println(list);
        System.out.println(map);
        System.out.println(courseList);
    }
}
