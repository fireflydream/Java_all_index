package com.weirui.array;

public class TwoDimensionalArray02 {
    public static void main(String[] args) {
        /*
         * 动态的二维数组 ： ---> 行数 是 不能省略的 ； 列数 是 可以省略的  ---> 体现了java的 “灵活性”
         * */
//    写法一：
//    int[][] arr;  声明一个二维数组
//    arr = new int[p][]; 再给它 开辟一块空间

//        写法二：
        int[][] arr = new int[3][4];  // 未初始化的二维数组的默认值是0
        /*
        *   0 0 0 0
        *   0 0 0 0
        *   0 0 0 0
        * */

//        写法三： 列数不确定
        int[][] arr2 = {{0, 1, 2, 3},{1, 5, 7},{8, 2}};
        /*
        *  0 1 2 3
        *  1 5 7
        *  8 2
        * */
    }
}
