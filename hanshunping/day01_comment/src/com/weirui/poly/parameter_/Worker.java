package com.weirui.poly.parameter_;

public class Worker extends Employee{
    // 定义一个work方法
    public void work() {
        System.out.println("普通员工 " + super.getName() + "正在工作……");
    }

    public Worker(String name, double salary, int month) {
        super(name, salary, month);
    }
    // 定义一个计算年工资getAnnual的重写方法
    public double getAnnual() {
        return super.getAnnual();
    }
}
