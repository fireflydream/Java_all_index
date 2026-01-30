package com.weirui.constructor;

public class Constructor01 {
    public static void main(String[] args) {
       /* Person p = new Person("李超", 23);
        System.out.println("p的信息如下:");
        System.out.print("p的对象名:" + p.name + "\t" + "年龄：" + p.age);*/

        Dog dog = new Dog("小黄", 2);
        dog.info();
    }
}
// 定义一个对象：Person
class Person {
    String name;
    int age;
    // 构造器
    public Person(String pName, int pAge) {
        System.out.println("只要new了一个对象进行传参且生成了构造器，那么它直接就被调用了");
        name = pName;
        age = pAge;
    }
    // 构造器重载
    public Person(String pName) {
        System.out.println("只要new了一个对象进行传参且生成了构造器，那么它直接就被调用了");
        name = pName;
    }
}
// 定义一个Dog类
class Dog {
    String name;
    int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // 成员方法
    public void info() {
        System.out.println(name + "\t" + age + "\t");
    }
}