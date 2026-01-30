package com.weirui.exersize;

public class Exersize15 {
    public static void main(String[] args) {
//        实例化一个对象AA（）
        AA a = new AA();
        boolean num = a.isOddEven(1);
        if (num) {
            System.out.println("是奇数");
        }else {
            System.out.println("是偶数");
        }
}
}
// 1. 定义一个类A
class AA {
    //    行为
    public boolean isOddEven(int num) {
//        条件运算符（三目运算符） 来判断 奇数偶数
        return  (num % 2 != 0) ? (true) : (false); // 我们假定结果是奇数，则为true；否则为 false
    }
}