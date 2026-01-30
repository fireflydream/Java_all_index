package com.weirui.exersize;

import java.util.Scanner;

public class Exersize02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("请输入一个年份：");
            int year = sc.nextInt();
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.println("闰年");
            }else {
                System.out.println("不是闰年");
            }
        }
    }
}
