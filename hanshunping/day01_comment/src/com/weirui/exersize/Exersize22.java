package com.weirui.exersize;

public class Exersize22 {
    public static void main(String[] args) {
        // 实例化一个对象Time()
        Time time = new Time();
    }
}
// 1. 定义一个类：Time
class Time {
    // 属性
    public int year;
    public int month;
    public int date;

    // 行为
//    2. 普通方法 vs 构造方法
    /*
    *  普通方法： 返回值类型 方法名 () {}
    *  构造方法： 方法名 () {}  ---> 构造方法的方法名与当前类的类型一致
    * */

    public Time() {  // 无参的构造方法
        this(2026, 1, 17);
        System.out.println("这是一个不带参的构造方法");
    }

    public Time(int year, int month, int date) {  // 带参的构造方法
        System.out.println("这是一个不带参的构造方法");
    }
}

