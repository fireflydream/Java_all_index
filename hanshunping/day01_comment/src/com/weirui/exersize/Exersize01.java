package com.weirui.exersize;

public class Exersize01 {
    public static void main(String[] args) {
        int cash = 100000;
        double tax = 0d;
        int count = 0;
        while (cash > 50000) {
            cash *= (1 - 0.05);
            count++;
        }
        while (cash <= 50000 && cash >= 1000) {
            cash -= 1000;
            count++;
        }
        System.out.println("该人可以经过" + count + "次路口");
    }
}
