package com.weirui.exersize;

public class Exersize11 {
    public static void main(String[] args) {
        char[] arr1 = {'a', 'z', 'b', 'c'};
        char[] arr2 = arr1; // 传址调用 ：arr2 发生变化后，arr1 也会跟着变化
        arr1[2] = '韩';
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr1[i] + "," + arr2[i]); // a,a z,z 韩,韩 c,c
        }
    }
}
