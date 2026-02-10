package com.weirui.poly.exercise;

public class Person {
    private String name;
    private int age;
    private char gender;

    // 重写Object 的 equals方法 ---> 先写一个Object 然后点进去，copy一份
    public boolean equals(Object obj) {
        // 判断 比较的两个对象是否为同一个对象； 若是，则直接返回true
        if (this == obj) {
            return true;
        }
        // 类型判断
        if (obj instanceof Person) {
            // 向下转型
            Person p = (Person) obj;
            // equals: 用来比较引用数据类型；如String类型
            // == ：既可以用来比较基本数据类型，又可以用来比较引用数据类型
            //     但它主要是用来比较基本数据类型的值是否相等
            return this.name.equals(p.name) && this.age == p.age && this.gender == p.gender;
        }
        // 编译器来到这里，说明类型不一致，则返回false
        return false;
    }

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}
