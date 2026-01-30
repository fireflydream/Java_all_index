package com.weirui.stringbuilder;

import java.util.Scanner;

public class StringBuilderDemo7 {
    public static void main(String[] args) {
        // 1. 键盘录入一个字符串
        Scanner sc = new Scanner(System.in);
        String str;
        while (true) {
            System.out.println("请输入一个字符串:");
            str = sc.next();

            boolean flag = isValidate(str);
            if (flag) {
                /*System.out.println("字符串长度符合要求");*/
                break;
            } else {
                System.out.println("字符串长度不符合要求");
                continue;
            }
        }
        // 查表法
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int number = c - '0';
            sb.append(toRoman(number));
        }
        System.out.println(sb);
    }
    // 定义一个方法，将字符串的内容变成罗马数字
    public static String toRoman(int num) {

        String[] arr = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

        return arr[num];
    }

    // 定义一个方法，用来判断字符串的长度和内容是否符合题干要求
    public static boolean isValidate(String str) {

        if (str.length() > 9) {

            return false;

        }
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!(c >= '0' && c <= '9')) {
                return false;
            }
        }
        return true;
    }
}
