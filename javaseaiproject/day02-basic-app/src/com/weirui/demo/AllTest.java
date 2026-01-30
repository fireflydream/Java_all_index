package com.weirui.demo;

import java.util.Scanner;

public class AllTest {
    public static void main(String[] args) {
        // 目标： 完成健康计算器
        Scanner sc = new Scanner(System.in);
        // 1.先让用户输入自己的个人信息
        System.out.println("请输入您的身高:");
        double height = sc.nextDouble();
        System.out.println("请输入您的体重");
        int weight = sc.nextInt();
        System.out.println("请输入您的性别：1-男， 2-女");
        String sex = sc.next();
        System.out.println("请输入您的年龄：");
        int age = sc.nextInt();

        double bmi = getBMI(height, weight);
        System.out.println("您的BMI值：" + bmi);

        double bmr = getBMR(sex, age, height, weight);
        System.out.println("您的BMR值：" + bmr);

    }
    //2.根据个人信息，计算BMI指数（把数据交给一个独立的方法来计算并返回结果）
    public static double getBMI(double height, int weight) {
        return weight / (height * height);
    }
    //3.根据个人信息，计算BMR指数，给出结果
    public static double getBMR(String sex, int age, double height, double weight) {
        double bmr = 0;
        if (sex.equals("1")) {
            bmr = (10 * weight) + (6.5 * height) - (5 * age) + 5;
        } else {
            bmr = (10 * weight) + (6.5 * height) - (5 * age) - 161;
        }
        return bmr;
    }
}
