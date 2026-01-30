package com.weirui.select;

public class DoWhile02 {
    public static void main(String[] args) {
        int i = 1;
        int n = 200;
        int sum = 0;
        int count = 0;
        //先死后活
        int p = 5;
        int q = 3;
        do {
            if (i % p == 0 && i % q != 0) {
                System.out.println("能被5整除且不能被3整除的数：" + i);
                count++;
            }
            i++;
        }while (i <= n);
        System.out.println(count);
    }
}
