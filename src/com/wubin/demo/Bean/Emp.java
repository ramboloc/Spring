package com.wubin.demo.Bean;

// 员工类
public class Emp {

    private String name;
    private String gender;

    // 员工属于某个部门，用对象表示
    private Dept dept;

    public Emp() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setDept(Dept dept) {
        this.dept=dept;
    }

    public void add(){
        System.out.println("姓名:"+name);
        System.out.println("性别:"+gender);
        System.out.println("部门:"+dept.toString());
    }
}
