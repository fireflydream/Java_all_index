package com.weirui.recursion;

public class Recursion03 {
    /*
    * 1. 请使用递归的方法求出斐波那契数 1 1 2 3 5 8 13……给你一个整数n，求出它的值是多少
    * */
    public static void main(String[] args) {
        E e = new E();
        int res = e.recursion(7);
        System.out.println(res);
    }
}
// 定义一个F类
class F {
    // 行为
    public int fibonacci(int n) {
        // n : 控制的是 项数的值
        if (n == 1 || n == 2) { // 这里处理的是 n <= 2 的情况
            return 1;
        }
        // 剩下的自然是处理 n > 2 的情况
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}