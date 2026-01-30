package com.weirui.exersize;

public class Exersize07 {
    public static void main(String[] args) {
        // 列数不确定的静态二维数组初始化
        int[][] arr = {{4, 6},{1, 4, 5, 7},{-2}};
        int sum = 0;
        /*
        * 确定行：确定一维数组的个数
        * 确定列：给一维数组开辟了一块空间
        * */
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println("sum = " + sum);
    }
}
