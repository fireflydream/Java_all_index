package com.weirui.poly.parameter_;

import java.lang.classfile.constantpool.DoubleEntry;

public class Employee {
    // 共有属性
    private String name;
    private double salary;
    public int month;

    public Employee(String name, double salary, int month) {
        this.name = name;
        this.salary = salary;
        this.month = month;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    // 定义一个计算年工资getAnnual的方法
    public double getAnnual() {
        return this.salary * this.month;
    }
}
