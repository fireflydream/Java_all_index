package com.weirui.exersize;

public class Exersize17 {
    public static void main(String[] args) {
//        2. 定义一个静态的二维数组
        int[][] arr = {{1, 2, 3}, {2, 3, 4}, {3, 4, 5}};
//        3. 实例化一个类BB的对象
        BB b = new BB();
        b.test100(arr);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
// 1. 定义一个类BB
class BB {
    // 行为
    public void test100(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = 0;
            }
        }
    }
}

//
