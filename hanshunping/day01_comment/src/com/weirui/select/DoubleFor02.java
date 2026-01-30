package com.weirui.select;

import java.nio.DoubleBuffer;
import java.util.Scanner;

public class DoubleFor02 {
    public static void main(String[] args) {
        int classNumm = 3; // 班级的数量
        int stuNum = 5; // 每个班学生的数量
        Scanner sc = new Scanner(System.in);
        double allClassAvg = 0; // 所有班级的平均分
        double allClassSum = 0; // 所有班级的总分
        double avg1 = 0.0;
        double sum2 = 0.0; // 所有班级平均分的总和
        int count = 0;
        for (int i = 1; i <= classNumm; i++) {
            System.out.println("第" + i + "个班级的成绩情况如下：");
            avg1 = 0.0; // 每个班级的平均分
            double sum1 = 0.0; // 每个班级的总分
            for (int j = 1; j <= stuNum; j++) {
                System.out.println("请输入第" + j + "个学生的成绩：");
                double score = sc.nextDouble();
                if (score >= 60) {
                    count++;
                }
                sum1 += score;
            }
            avg1 = sum1 / stuNum;
            System.out.println("第" + i + "个班级的平均分：" + avg1);
            sum2 += avg1; // 所有班的平均分总和
        }
        allClassAvg = sum2 / classNumm;
        System.out.println("各个班的平均分为：" + allClassAvg);
        System.out.println("三个班共及格" + count + "人");
    }
}
