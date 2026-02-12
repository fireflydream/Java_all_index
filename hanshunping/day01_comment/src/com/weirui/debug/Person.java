package com.weirui.debug;

public class Person {
    private String name;
    private int age;
    private char gender;

    // 重写Person的父类Object的toString方法

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

}
