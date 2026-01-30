package com.weirui.exersize;

public class Exersize19 {
    public static void main(String[] args) {
        /*题目：
        *  1. 编写类MyTools，编写一个方法可以打印二维数据的数据
        * */

//        2. 给类MyTools 实例化一个对象
        MyTools myTools = new MyTools();
        myTools.print(4, 8, '$');
    }
}
// 1. 定义一个类：MyTools
class MyTools {
    // 行为
    public void print(int row, int col, char c) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}
