package com.weirui.stringbuilder;

public class StringBuilderDemo4 {
    public static void main(String[] args) {
        // 1. 创建一个数组并初始化
        int[] arr = new int[]{1, 2, 3};

        String s = arrToString(arr);

        System.out.println(s);
    }
    // 2. 定义一个方法，将数组中的内容拼接成一个字符串并返回
    public static String arrToString(int[] arr) {
        // 创建一个StringBuilder对象
        StringBuilder sb = new StringBuilder();

        sb.append("[");
        for (int i = 0; i < arr.length; i++) {

            if (i == arr.length - 1) {
                sb.append(arr[i]).append("]");
            }else {
                sb.append(arr[i]).append(",");
            }
        }
        return sb.toString();// sb它是一个容器，返回时需返回一个字符串. -- toString()
    }
}
