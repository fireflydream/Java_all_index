package com.weirui.exersize;

public class Exersize05 {
    public static void main(String[] args) {
        /*
        *  求 1 - 1/2 + 1/3 - 1/4……1/100
        *  ---> 本质：奇数偶数分项累加
        * */
        double sum =0d;
        for (int i = 1; i <= 100; i++) {
            double score = 1.0 / i; // 定义一个分数变量来存储 1 / i
            if (i % 2 == 1) {  // 奇数项累加
                sum += score;
            }else {
                sum -= score; // 偶数项累加
            }
        }
        System.out.println("1 - 1/2 + 1/3 - 1/4……1/100的和：" + sum);
    }
}
