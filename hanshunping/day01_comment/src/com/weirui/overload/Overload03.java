package com.weirui.overload;

public class Overload03 {
    public static void main(String[] args) {
        Methods2 methods2 = new Methods2();
        double res = methods2.max(7.5, 5.5, 12.5);
        System.out.println(res);
    }
}
// 定义一个类：Methods
class Methods2 {
    public int max(int m, int n) {
        return (m > n) ? (m) : (n);
    }
    public double max(double m, double n) {
        return (m > n) ? (m) : (n);
    }
    public double max(double m, double n, double p) {
        double max = m;
        if (m < n) {
            max = n;
        }else if (m < p) {
            max = p;
        }else {
            max = m;
        }
        return max;
    }
}