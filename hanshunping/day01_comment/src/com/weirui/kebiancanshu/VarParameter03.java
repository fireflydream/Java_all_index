package com.weirui.kebiancanshu;

public class VarParameter03 {
    public static void main(String[] args) {
        /*
        * 1. 有三个方法，分别实现返回姓名和两门课成绩（总分），返回姓名和三门课程成绩（总分），返回姓名和五门课成绩（总分）。
        * 封装成一个可变参数
        * */

        L l = new L();
        String res = l.nameAndScore("李超", 88, 80);
        System.out.println(res);
    }
}
// 定义一个类: L
class L {
    public  String nameAndScore(String name, double... score) {
        // 定义一个变量totalScore来接收总分
        double totalScore = 0;
        for (int i = 0; i < score.length; i++) {
            totalScore += score[i];
        }
        return name + "有" + score.length + "门成绩总分为：" + totalScore;
    }
}