package com.weirui;

import java.util.Scanner;

public class ArrayDemo01 {
    public static void main(String[] args) {
        // 动态数组：数组的容量是可变的
        double[] scores = new double[5];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < scores.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个学生的成绩：");
            scores[i] = sc.nextDouble();
        }
        // 求平均分
        double sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        System.out.println("平均分：" + sum / scores.length);
    }
}
