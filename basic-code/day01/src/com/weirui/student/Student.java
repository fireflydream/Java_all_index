package com.weirui.student;

public class Student {
    // 属性
    private String name;
    private int age;

    // 如果我们没有写构造方法，那么系统会默认生成一个无参构造方法
    public Student() {
        System.out.println("无参构造方法");
    }

    // 带参构造方法：可以直接给属性赋值
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 给属性构造setter和getter方法
    public void setName(String name) {
        this.name = name; // this.name把接收到的值传给属性 name
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    // 行为
    public void study() {
        System.out.println(name + "认真学习");
    }
    // 除了构造方法外，所有的方法都采用小驼峰的命名形式
    public void classBegin() {
        System.out.println(name + "开始上课");
    }

}
