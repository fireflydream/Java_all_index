package com.weirui.recursion;

public class Recursion01 {
    public static void main(String[] args) {
        // 实例化一个对象
        T t = new T();
//        t.test(5);
        int res = t.factorial(5);// 120
        System.out.println(res);
    }
}
// 1. 定义一个T类
class T {
    // 属性

    // 行为
    public void test(int n) {
        if (n > 2) { // 5 4 3
            test(n - 1); // 递归3次
        }else {
            System.out.println("n = " + n); // 仅执行一次（当 n = 2 时）

        }
    }

//    阶乘
    public int factorial(int n) {
        if (n == 1) {
            return 1;
        }else {
            return n * factorial(n - 1);
        }
    }
}
