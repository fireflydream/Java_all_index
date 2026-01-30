package com.weirui.exersize;

import java.util.Scanner;

public class Exersize03 {
    public static void main(String[] args) {
        /*
        * 水仙花数(只有三位数)：该数的各个位的立方和 == 该数本身
        * */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int num = sc.nextInt();
        int ge = num % 10;
        int shi = (num / 10) % 10;
        int bai = (num / 10 / 10) % 10;
        int num2 = ge * ge * ge + shi * shi * shi + bai * bai * bai;
        if (num == num2) {
            System.out.println("该数是水仙花数");
        }else {
            System.out.println("该数不是水仙花数");
        }
    }
}
