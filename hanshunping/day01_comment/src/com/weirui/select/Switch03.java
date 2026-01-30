package com.weirui.select;

import java.util.Scanner;

public class Switch03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生的成绩：");
        double score = sc.nextDouble();
        //switch里面的表达式不能是double类型的变量
        if (score >= 0 && score <= 100) {
            switch ((int) score / 60) {
                case 1:
                    System.out.println("成绩合格");
                    break;
                case 0:
                    System.out.println("成绩不合格");
                    break;
            }
        }else {
            System.out.println("成绩输入有误，请重新输入！");
        }
    }
}
