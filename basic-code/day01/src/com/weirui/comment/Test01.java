package com.weirui.comment;

public class Test01 {
    public static void main(String[] args) {
        // 定义一个数组并初始化
        int arr[] = {5, 8, 11, 23, 56};

        // 调用方法
        int max = getMax(arr);
        System.out.println(max);
    }
    // 定义一个方法用来求出该数组的最大值，并返回
    public static int getMax(int arr[]) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max  = arr[i];
            }
        }
        return max;
    }
}
