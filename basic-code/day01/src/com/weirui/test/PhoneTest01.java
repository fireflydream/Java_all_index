package com.weirui.test;

public class PhoneTest01 {
    public static void main(String[] args) {
        // 创建一个手机对象
        Phone p = new Phone();

        // 赋值  ： 通过 对象名.属性名 = 值
        p.brand = "小米";
        p.price = 1999.9;

        // 打印出成员属性的值
        System.out.println(p.brand);
        System.out.println(p.price);

        // 调用成员方法
        p.call();
        p.showTikTok();

        System.out.println("------------------");

        // 创建第二个手机对象
        Phone p2 = new Phone();

        p2.brand  = "华为";
        p2.price = 5999.9;

        System.out.println(p2.brand);
        System.out.println(p2.price);

        p2.call();
        p2.showTikTok();
    }
}
