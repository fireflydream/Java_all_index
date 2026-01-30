package com.weirui.demo;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        // 目标：简易版计算器开发
        // 1.键盘录入两个整数和运算符
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字：");
        double num1 = sc.nextDouble();
        System.out.println("请输入第二个数字：");
        double num2 = sc.nextDouble();
        System.out.println("请输入运算符(+ - * /)：");
        String operator = sc.next();

        System.out.println("结果为：" + calc(num1, num2, operator));
    }
    public static double calc(double num1, double num2, String operator) {
        switch (operator) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                return num1 / num2;
            default:
                return 0;
        }
    }
}
