package com.weirui.exersize;
// 父类
public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String say() {
        System.out.println("===自我介绍===");
        return "姓名：" + this.name + " " + "年龄：" + this.age + " ";
    }

}
