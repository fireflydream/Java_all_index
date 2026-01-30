package com.weirui.extend_;

// 父类
public class Student {
    // 共用属性
    String name;
    int age;
    char gender;
    private double score;

    // 无参构造器
    /*public Student() {

    }*/

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 共用方法
    // 给私有化的属性进行封装
    public void setScore(double score) {
        this.score = score;
    }
    // 写一个方法info,并返回属性的值
    public String info() {
        return "姓名：" + name + " " + "年龄：" + age + " " +  "成绩：" + score;
    }
    private void stu1() {
        System.out.println("在父类中定义一个新的公开方法来调用我，然后在子类Pupil中调用这个公开方法");
    }
    public void stu2() {
        stu1();
    }
}
