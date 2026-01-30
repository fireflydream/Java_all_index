package com.weirui.array;

public class Array04 {
    public static void main(String[] args) {
        /*
        * 求出一个数组int[]的最大值{4, -1, 9, 10, 23},并得到对应的下标
        * */

        int[] arr = {4, -1, 9, 25, 10, 23};
        int max = arr[0]; // 假设第一个元素使最大值，并赋值给max
        int maxIndex = 0; // 用变量maxIndex来表示索引的最大值
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                maxIndex = i;
            }
        }
        System.out.println("该数组中最大值为：" + max + "对应的索引为：" + maxIndex);
    }
}
