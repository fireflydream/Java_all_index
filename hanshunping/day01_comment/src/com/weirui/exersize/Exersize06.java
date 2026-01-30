package com.weirui.exersize;

public class Exersize06 {
    public static void main(String[] args) {
        // 求 1 + （1 + 2） + （1 + 2 + 3） +（1 + 2 + 3 + 4） + ……+（1 + 2 + 3 +……+ 100）
        // 考察： 两层嵌套循环 外层循环控制累加的项数，内层循环计算每一项的和

        int n = 100; // 表示的是项数
        //  计算1到n的和：Σn = (1 + n) * n / 2
        long sumN = (1 + n) * n / 2;
        //  计算1到n的平方和 :Σn² = n*(n+1)*(2n+1)/6
        long sumNSquare = (1 + n) * n * (2 * n + 1) / 6;
        // 总和 = (Σn + Σn²) / 2
        long total = (sumN + sumNSquare) / 2;
        System.out.println("最终结果是：" + total);
    }
}

