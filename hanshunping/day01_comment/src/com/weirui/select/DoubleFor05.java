package com.weirui.select;

public class DoubleFor05 {
    public static void main(String[] args) {
//        打印一个菱形
        // 1. 打印一个矩形
//        *****           *       第一层： 1个星星  2个空格
//        *****          * *      第二层： 2个星星  1个空格
//        *****         *   *     第三层： 2个星星  0个空格
//        *****          * *      第四层： 2个星星  1个空格
//        *****           *       第五层： 1个星星  2个空格
        // 上半个三角形
        for (int i = 1; i <= 3; i++) {
            for (int k = 1; k <= 3 - i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i -1; j++) {
                if (j == 1 || j == 2 * i - 1) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        // 下半个三角形
        for (int i = 2; i >= 1; i--) {
            for (int k = 1; k <= 3 - i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}
