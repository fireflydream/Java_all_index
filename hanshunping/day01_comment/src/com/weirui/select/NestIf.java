package com.weirui.select;

import java.util.Scanner;

public class NestIf {
    public static void main(String[] args) {
        /*
        * 出票系统：根据淡旺季的月份和年龄，打印票价
        * */
        int TICKET_PRICE = 60;
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入当前的月份：");
        int month = sc.nextInt();
        if (month >= 4 && month <= 10) {
            System.out.println("请输入购票人的年龄：");
            age = sc.nextInt();
            if (age < 18) {
                System.out.println("您需要支付" + (TICKET_PRICE / 2) + "元");
            } else if (age >= 18 && age <= 60) {
                System.out.println("您需要支付" + TICKET_PRICE + "元");
            }else {
                System.out.println("您需要支付" + (TICKET_PRICE / 3) + "元");
            }

        }else {
            System.out.println("请输入购票人的年龄：");
            age = sc.nextInt();
            if (age >= 18 && age <= 60) {
                System.out.println("您需要支付" + (TICKET_PRICE * 2 / 3) + "元");
            }else {
                System.out.println("您需要支付" + (TICKET_PRICE / 3) + "元");
            }
        }
    }
}
