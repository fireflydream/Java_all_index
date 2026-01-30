package com.weirui.array;

import java.util.Scanner;

public class Array02 {
    public static void main(String[] args) {
        // 循环输入5个成绩，保存到double数组，并输出
        Scanner sc = new Scanner(System.in);
        double[] scores = new double[5];
        for (int i = 0; i < scores.length; i++) { // 数组的坑点：索引是从0开始的，因此循环变量也要从0开始
            System.out.println("请输入第" + (i +1) + "个成绩："); // 这个用 （i + 1）表示从第一个成绩开始
            scores[i] = sc.nextDouble();
        }
//        1. 输出
//        System.out.println("5个成绩分别为：" + scores[0] + "分 " + scores[1] + "分 " + scores[2] + "分 " +
//                scores[3] + "分 " + scores[4] + "分");

//        2.输出 ---> for循环遍历输出
        for (int i = 0; i < scores.length; i++) {
            System.out.println("第" + (i + 1) + "个成绩为：" + scores[i] + "分");
        }
    }
}
