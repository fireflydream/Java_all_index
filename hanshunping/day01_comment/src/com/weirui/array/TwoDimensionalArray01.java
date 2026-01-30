package com.weirui.array;

public class TwoDimensionalArray01 {
    public static void main(String[] args) {
        /*
        * 二维数组
        * */
        int[][] arr = {{0, 0, 0, 0, 0, 0}, {0, 0, 1, 0, 0,  0},{0, 2, 0, 3, 0, 0},{0, 0, 0, 0, 0, 0}};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {  // arr[i].length : 得到每一个一维数组的长度 --> 简单来说：知道每一行里面有多少列
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
