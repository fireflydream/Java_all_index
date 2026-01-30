package com.weirui.exersize;


public class Exersize14 {
    public static void main(String[] args) {
        /*
        *   知识点：
        *  1. 在同一类中，方法可以直接嵌套调用另一个方法
        *  2. 在不同类中，需要通过 “在类A中 实例化 类B这个对象” + " 对象.方法() " 的方式来调用另一个方法
        * */

//        a类中的方法调用b类中的方法

        A one = new A();
        one.method01();

    }
}
// 1. 定义一个类A
class A {
    // 行为
    public void method01() {
        System.out.println("我是第一个被执行的语句");

//        3. 在类A里面实例化一个对象来调用类B中的方法
        B two = new B();
        two.method02();

        System.out.println("我是第三个被执行的语句");
    }
}
//2. 定义一个类B
class B {
//    行为
    public void method02() {
        System.out.println("我是第二个被执行的语句");
    }
}
