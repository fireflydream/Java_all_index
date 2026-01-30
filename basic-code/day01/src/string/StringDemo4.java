package string;

import java.util.Scanner;

public class StringDemo4 {
    public static void main(String[] args) {
        // 1. 键盘录入一个字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str1 = sc.next();

        // 2. 遍历这个字符串  -- str1.length().fori
        for (int i = 0; i < str1.length(); i++) {
            // i ：字符串中的每个字符的索引
            char c = str1.charAt(i);
            System.out.print(c + " ");
        }
    }
}
