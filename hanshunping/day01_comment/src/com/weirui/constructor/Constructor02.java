package com.weirui.constructor; // package + 包名

public class Constructor02{
    public static void main(String[] args) {
        T t = new T();
        t.p();
    }
}
// 定义一个类：T
class T {
    String name;
    int age;
    // 构造器
    public T() {
        // 想在这里访问T(String name, int age)这个构造器，则必须在第一行进行访问
        this("Tom", 25);
    }
    public T(String name, int age) {
        this.name = name;
        this.age = age;
        // System.out.println("姓名：" + name + "\t" + "年龄：" + age);
    }
    public void p() {
        // name 与 this.name 的区别
        // 若name的作用域内有一个同名的局部变量时，就会触发局部变量作用域的就近原则
        String name = "张三";
        int age = 20;
        System.out.println("姓名：" + name + "\t" + "年龄：" + age);
        // 而this调用的变量永远指向属性
        System.out.println("姓名：" + this.name + "\t" + "年龄：" + this.age);
    }
}