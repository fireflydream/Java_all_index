package com.weirui.branch;

import java.util.Scanner;

public class SwitchDemo01 {
    public static void main(String[] args) {
        // 目标：搞清楚switch分支结构的应用和写法，理解其执行流程
        printBookInfo();
    }
    // 需求：根据男女性别的不同，推荐不同的书本信息给其观看
    public static void printBookInfo() {
        // 1.让用户输入自己的性别
        System.out.println("请输入您的性别：");
        Scanner sc = new Scanner(System.in);
        String sex = sc.next();

        // 2.使用switch分支结构，进行判断
        switch (sex) {
            case "男":
                System.out.println("推荐《java从入门到精通》");
                break;
            case "女":
                System.out.println("推荐《java从入门到精通》");
                break;
            default:
                System.out.println("请重新输入！");
        }
    }
}
