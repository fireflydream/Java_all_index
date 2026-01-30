package com.weirui.select;

public class For02 {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 9 == 0) { // 9的倍数 --> i % 9 后没有余数
                System.out.println(i);
                count++;
                sum += i;
            }
        }
        System.out.println("count =" + count);
        System.out.println("sum =" + sum);
    }
}
