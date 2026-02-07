package com.weirui.poly.parameter_;

public class Manager extends Employee{
    private double bonus;

    // 定义一个管理manage方法
    public void manage() {
        System.out.println("经理 " + super.getName() + "正在工作");
    }

    public Manager(String name, double salary, int month, double bonus) {
        super(name, salary, month);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    // 定义一个计算年工资getAnnual的重写方法
    public double getAnnual() {
        return super.getAnnual() + this.bonus;
    }
}
