package com.weirui.stringbuilder;

import java.util.Scanner;

public class StringBuilderDemo3 {
    /**
     * 使用StringBuilder的场景：
     * 1. 对字符串进行拼接
     * 2. 对字符串进行反转
     * */
    public static void main(String[] args) {
        // 1. 键盘录入一个字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = sc.next();

        // 2. 调用StringBuilder的方法，来链式编程一个字符串.

        // new一个StringBuilder对象就不要让它赋给一个变量了,而是直接将它进行链式编程
        String result = new StringBuilder().append(str).reverse().toString();

        // 3. 判断
        if (str.equals(result)) {
            System.out.println("这个字符串是对称的");
        }else {
            System.out.println("这个字符串不对称");
        }
    }
}
