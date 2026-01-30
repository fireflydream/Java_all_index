package com.weirui.overload;

public class Overload02 {
    public static void main(String[] args) {
        Methods methods = new Methods();
        System.out.println(methods.m(10));
        System.out.println(methods.m(10, 5));
        System.out.println(methods.m("123456"));
    }
}
// 定义一个类:Methods
class Methods {
    public double m(int m) {
        return m * m;
    }
    public int m(int m, int n) {
        return m * n;
    }
    public String m(String s) {
        return s;
    }
}
