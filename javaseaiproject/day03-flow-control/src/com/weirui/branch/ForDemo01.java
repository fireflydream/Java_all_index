package com.weirui.branch;

public class ForDemo01 {
    public static void main(String[] args) {
        /*int sum = sum(100);
        System.out.println("1~100的和：" + sum);*/

        int jishuSum = jishuSum(5);
        System.out.println("1~5的奇数和：" + jishuSum);  // 1 3 5
    }
    public static int sum(int n) {
        // shift + f6 : 替换
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
    public static int jishuSum(int m) {
        int sum = 0;
        for (int i = 1; i <= m; i += 2) {
            sum += i;
        }
        return sum;
    }
}
