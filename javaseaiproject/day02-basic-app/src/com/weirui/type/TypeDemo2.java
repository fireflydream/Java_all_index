package com.weirui.type;

public class TypeDemo2 {
    public static void main(String[] args) {
        // 目标：理解表达式的自动类型提升
        int result = calc2((byte) 110, (byte) 120);
        System.out.println(result);
    }
    // 需求：接收各种类型的数据运算
    public static double calc(int a, double b) {
        return a + b;
    }
    public static byte calc2(byte a, byte b) {
        return (byte)(a +b);
    }
    // 在表达式的运算中，byte short char 自动提升为 int
    public static int calc3(byte a, byte b) {
        return a + b;
    }

}

