package com.weirui.type;

public class TypeDemo1 {
    public static void main(String[] args) {
        // 目标：认识自动类型转换，强制类型转换
        byte a = 10;
        print(a); // 自动类型转换 byte -> int
        print2(a);// 自动类型转换 byte -> double

        // 强制类型转换
        int d = 20; // 32bit --> 00000000 00000000 00000000 00010100
        byte e = (byte) d; // 8bit 发生截断：从32bit的右边开始截断

        int i = 1500; // 32bit --> 00000000 00000000 00000101 11011100
        byte f = (byte) i; // 8bit 发生截断：从32bit的右边开始截断 11011100（原码） 符号位是1，截断后变成负数 。由于计算机存储的是补码 所以要将原码转换为补码
        // 负数的补码：原码的符号位不变，其余位按位取反 -->反码（10100011） ， 反码 + 1 --> 补码（10100100） <==> -36
    }

    public static void print(int b) {
        System.out.println(b);
    }
    public static void print2(double c) {
        System.out.println(c);
    }

}
