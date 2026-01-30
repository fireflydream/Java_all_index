package com.weirui.exersize;

public class Exersize16 {
    public static void main(String[] args) {
        /* 题目：
        *  1. 根据行、列、字符打印 对应行书和列数的字符，比如：行：4，列：4，字符 #
        * */
//        效果如下：
//                ####
//                ####
//                ####
//                ####

        C c = new C();
        c.print(4, 4, '#');
    }
}
// 1. 定义一个类C
class C {
    // 方法
    public void print(int row, int col, char c) {  // 定义一个print() 形参为 行 列 字符
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
