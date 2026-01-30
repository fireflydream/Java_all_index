package com.weirui.kebiancanshu;

public class VarParameter02 {
    public static void main(String[] args) {
        // 规范1：数组可作为可变参数的一个实参 【只能放一维数组，二维数组会报错 ！】
        int[] arr = new int[3];
        K k = new K();
        k.k(arr);
    }
}
// 定义一个类：K
class K {
    public void k(int... nums) {
        // 数组、可变参数 可通过for循环进行赋值和遍历
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i;
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
    public void kk(double d, int... a) {

    }
    // 错误示范
    /*public void kk(double... d, int... a) {

    }*/
}
