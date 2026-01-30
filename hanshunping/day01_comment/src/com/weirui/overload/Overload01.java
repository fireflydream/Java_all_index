package com.weirui.overload;

public class Overload01 {
    public static void main(String[] args) {
        MyCalculator c = new MyCalculator();
        int res = c.calculator(2, 5, 10);
        System.out.println(res);
    }
}
// 定义一个类:MyCalculator
class MyCalculator {
    // 属性

    // 行为
    public int calculator(int m, int n) {
        return m + n;
    }
    public double calculator(int m, double n) {
        return m + n;
    }
    public double calculator(double m, int n) {
        return m + n;
    }
    public int calculator(int m, int n, int p) {
        return m + n + p;
    }
}
