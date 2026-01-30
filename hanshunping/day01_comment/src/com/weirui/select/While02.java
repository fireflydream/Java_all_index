package com.weirui.select;

public class While02 {
    public static void main(String[] args) {
        /*
        * 编程思想的2大技巧：
        * 1.化繁为简
        * 2.先死后活
        *
        * */
        int i = 40;
        int n = 200;
        int j = 2;
        while (i <= n) {
            if (i % j == 0) {
                System.out.println("40-200之间的偶数：" + i);
            }
            i++;
        }
    }
}
