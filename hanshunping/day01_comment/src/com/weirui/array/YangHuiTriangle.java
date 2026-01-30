package com.weirui.array;

public class YangHuiTriangle {
    public static void main(String[] args) {
        /*
        * 杨辉三角
        * */
//        1
//        1 1
//        1 2 1
//        1 3 3 1
//        1 4 6 4 1
        /*
        *  特点：
        *  1. 第1行 有1个 ，第n行 有n个
        *  2. 每行的第一个数 和 最后一个数 都是1
        *  3. 从第3行开始，对于非第一个数和非最后一个数的值 == 上一行的同一列 与 上一行的同一列的前一个 之和
        *   ---> arr[i][j] == arr[i - 1][j] + arr[i - 1][j - 1];
        * */

//        1.
//        1.1 用动态的二维数组来定义杨辉三角
        int[][] yangHui = new int[5][]; // 声明并创建了每一个一维数组
//        1.2 给每一个一维数组开辟一块空间
        for (int i = 0; i < yangHui.length; i++) {
            yangHui[i] = new int[i + 1]; // 开辟空间 并 确保了等号右边的数组大小 >= 1
//        2.1 给每一个一维数组赋值 ---> 给数组赋值、遍历数组、修改数组元素 都要用到for循环
        for (int j = 0; j < yangHui[i].length; j++) {
//        2.2 每行的第一个数 和 最后一个数 都是1
            if (j == 0 || j == yangHui[i].length - 1) {
                yangHui[i][j] = 1;
//        3.对于非第一个数和非最后一个数的值 == 上一行的同一列 与 上一行的同一列的前一个 之和
            }else { // 中间元素
                yangHui[i][j] = yangHui[i - 1][j] + yangHui[i - 1][j - 1];
            }
        }
        }
        // 遍历
        System.out.println("杨辉三角如下：");
        for (int i = 0; i < yangHui.length; i++) {
            for (int j = 0; j < yangHui[i].length; j++) {
                System.out.print(yangHui[i][j] + " ");
            }
            System.out.println();
        }
    }
}
