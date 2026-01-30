package com.weirui.exersize;

public class Student extends Person{
    // 私有属性
    private String id;
    private double score;

    public Student(String name, int age) {
        super(name, age); // 完成父类的初始化
    }
    // 完成子类的初始化
    public Student(String name, int age, String id, double score) {
        super(name, age);
        this.id = id;
        this.score = score;
    }


    public String say() {
        System.out.println("===自我介绍===");
        return "姓名：" + super.getName() + " " + "年龄：" + super.getAge() + " " + "学号：" + this.id + " " + "分数：" + this.score;
    }
}
