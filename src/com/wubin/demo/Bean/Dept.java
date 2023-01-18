package com.wubin.demo.Bean;

// 部门类
public class Dept {
    @Override
    public String toString() {
        return "Dept{" +
                "dept_name='" + dept_name + '\'' +
                '}';
    }

    private String dept_name;

    public void setDept_name(String dept_name) {
        this.dept_name = dept_name;
    }
}
