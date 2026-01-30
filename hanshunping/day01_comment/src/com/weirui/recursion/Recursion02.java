package com.weirui.recursion;

public class Recursion02 {
    public static void main(String[] args) {
        E e = new E();
        int res = e.recursion(3);
        System.out.println(res);
    }
}
// 定义一个E类
class E {
    // 属性

    // 行为
    public int recursion(int n) {
        // n : 项数的值
        if (n == 1 || n == 2) { // 这里已经处理了 n <= 2 的这种情况了
            return 1;
        }
        // 剩下的这里自然就是 n > 2 的情况了
            return recursion(n - 1) + recursion(n - 2);
    }
}
