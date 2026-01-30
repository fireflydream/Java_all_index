package com.weirui.kebiancanshu;

public class VarParameter04 {
    public static void main(String[] args) {
        M m = new M();
        m.m(); // age: 23
        m.age = 20; // age:20
    }
}
// 定义一个类 : M
class M {
    String name;
    int age;

    public void m() {
        int age = 23;
        System.out.println("你的年龄为：" + age);
    }
}
