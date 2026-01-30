package com.weirui.exersize;

public class Exersize18 {
    public static void main(String[] args) {
//        2. 分别为类PersonOne、类PersonTwo 实例化一个对象
        PersonOne p1 = new PersonOne();
        // 给类PersonOne中的属性赋值
        p1.name = "jack";
        p1.age = 10;

        PersonTwo p2 = new PersonTwo();
        // p2调用类PersonTwo的方法
        p2.test200(p1);
//        3.输出
        System.out.println("main 的p1.age = " + p1.age);

    }
}
// 1. 定义两个类：PersonOne PersonTwo
class PersonOne {
    // 属性
    String name;
    int age;
    // 行为
}
class PersonTwo {
    // 行为
    public void test200(PersonOne p1) {
        p1 = null;
    }
}
