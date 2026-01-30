package com.weirui.array;

public class TwoDimensionalArray03 {
    public static void main(String[] args) {
        int[][] arr;
        arr = new int[3][]; // 创建一个二维数组，只能确定一维数组的个数，但每个一维数组并未开辟空间
        /*
        * --> 第0行  i = 0:  1
        * --> 第1行  i = 1:  2 2
        * --> 第2行  i = 2:  3 3 3
        * */
        for (int i = 0; i < arr.length; i++) {
            // 若没有给一维数组 new,则一维数组里面是null
            arr[i] = new int[i + 1]; // new int[i + 1] : 给一维数组中的每一列开辟一块空间
            // 为什么是 等号右边的索引是 i + 1？ 因为当 i = 0 时，int[i + 1] = int[1] ---> 关键：也就是说数组的大小 >= 1
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = i + 1;
            }
        }
        // 遍历
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
