package com.weirui.method;

public class MethodDemo2 {
    public static void main(String[] args) {
        // 目标：认识方法重载 --> 同一个方法名，参数列表(类型不同、个数不同、顺序不同)不同
    }

    // 定义一个方法，打印一个整数
    public static void print(int a) {
        System.out.println(a);
    }
    // 定义一个重载方法
    public static void print(String str) {
        System.out.println(str);
    }
}
