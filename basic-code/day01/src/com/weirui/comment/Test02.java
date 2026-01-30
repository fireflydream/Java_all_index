package com.weirui.comment;

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        // 定义一个数组并初始化
        int arr[] = {1, 2, 3, 4, 5};
        // 调用方法，并返回一个值
        boolean b = isExist(arr);
        System.out.println(b);
    }
    // 定义一个方法，用来判断该数组中的某一个元素是否存在，若存在，则将结果返回调用处
    public static boolean isExist(int arr[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要查找的元素：");
        int num = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return true;
            }
        }
        // 循环结束，没有找到
        return false;
    }
}
