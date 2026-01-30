package com.weirui.demo;

public class Test03 {
    public static void main(String[] args) {
        // 目标：找出101-200之间的全部素数
        for (int i = 101; i <= 200 ; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }
    public static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
