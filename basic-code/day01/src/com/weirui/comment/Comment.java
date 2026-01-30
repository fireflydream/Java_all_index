package com.weirui.comment;

import java.util.Scanner;

public class Comment {
    public static void main(String[] args) {

       // Scanner sc = new Scanner(System.in);

        int arr[] = {11, 22, 33, 44, 55, 66};

        printArray(arr);
    }
    // 定义一个方法，用来遍历出数组arr中的每一个元素.要求：[11, 22, 33, 44, 55]
    public static void printArray(int arr[]) {
        // 在循环前打印[
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
        // 在循环后打印]
        System.out.print("]");
    }
}
