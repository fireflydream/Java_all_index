package com.weirui.debug;

// debug对象创建的过程，加深对调试的理解
public class DebugExercise {
    public static void main(String[] args) {
        // 创建对象的流程
        //(1) 加载 Person 类信息
        //(2) 初始化 2.1 默认初始化，2.2 显式初始化 2.3 构造器初始化
        //(3) 返回对象的地址
        Person p1 = new Person("李超", 23, '男');
        System.out.println(p1);
    }
}
