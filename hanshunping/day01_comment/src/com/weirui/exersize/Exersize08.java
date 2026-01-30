package com.weirui.exersize;

public class Exersize08 {
    public static void main(String[] args) {
        String foo = "blue"; // 我们定义一个变量foo 它的数据类型是String
        boolean[] bar = new boolean[2]; // 我们定义一个一维数组bar 它的数据类型是boolean
        if (bar[0]) { // bar[0] == 0 ---> false 跳出if语句
            foo = "green";
        }
        // 跳出if语句  来到这里
        System.out.println(foo); // 输出 blue
    }
}
