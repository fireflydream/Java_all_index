package com.weirui.exersize;

public class Exersize24 {
    public static void main(String[] args) {
        J j = new J();
        J k = j; // 用k来指定j
        J l = k; // 用l来指定k
        System.out.println(j == k);

        // 查看jdk的源码 ： ctrl + 左键
        // "hello".equals("abc");

    }
}
class J {

}
