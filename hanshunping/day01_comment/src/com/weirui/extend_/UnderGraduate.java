package com.weirui.extend_;

// 子类：继承Student的父类
public class UnderGraduate extends Student {
    public UnderGraduate(String name, int age) {
        super(name, age);
    }

    public void testing() {
        System.out.println("大学生" + name + "正在考试");
    }
}
