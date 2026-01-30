package com.weirui.select;

import java.util.Scanner;

public class Switch01 {
    public static void main(String[] args) {
        /*
        * switch的用法
        * */
        System.out.println("今天星期几？");
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        switch (day) {
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
            case 7:
                System.out.println("休息日");
                break;
            default:
                System.out.println("您输入的信息有误，请从新输入！");
        }
        System.out.println("退出了switch，继续执行程序");
    }
}
