package com.weirui.poly.dynamicbinding;
/*
* java的动态访问机制
* */

public class DynamicBinding {
    public static void main(String[] args) {
        // 实例化一个子类对象B
        A a = new B(); // 向上提升
        // 只要是方法的访问，就要看对象的运行类型

        // 该对象的运行类型是B
        System.out.println(a.sum()); // 30
        // 该对象的运行类型是B
        System.out.println(a.sum1()); // 30
    }
}
