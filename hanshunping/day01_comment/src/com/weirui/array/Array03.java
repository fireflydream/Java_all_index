package com.weirui.array;

public class Array03 {
    public static void main(String[] args) {
        /*
        * 创建一个char类型的26个元素的数组，分别放置‘A’-‘Z’。使用for循环访问所有元素并打印出来
        * 提示：char类型数据运算： ‘A' + 1 --> 'B'
        * */

        // 方法一：把26个字母存放在字符数组中，通过在for循环中遍历访问到每一个元素并打印
//        char[] letter = {'A', 'B', 'C', 'D','E', 'F', 'G', 'H','I', 'J', 'K', 'L','M', 'N', 'O', 'P','Q', 'R',
//                'S', 'T','U', 'V', 'W','X', 'T', 'Z'};
//        for (int i = 0; i < letter.length; i++) {
//            System.out.print(letter[i]);
//            System.out.print(" ");
//        }

//        方法二：
        char[] letter2 = new char[26];
        for (int i = 0; i < 26; i++) {
            letter2[i] = (char) ('A' + i); // “常量 + 变量” --> 变很多次
        }
        for (int i = 0; i < 26; i++) {
            System.out.print(letter2[i] + " ");
        }
    }
}
