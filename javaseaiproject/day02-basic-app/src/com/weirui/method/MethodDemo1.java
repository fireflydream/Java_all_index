package com.weirui.method;

public class MethodDemo1 {
    public static void main(String[] args) {

        // main方法是程序的入口，每定义好一个方法，都需要在main方法下进行调用
        int sum = getSum(10, 20);
        //输出
        System.out.println("两个整数的和：" + sum);

        System.out.println("-------------");

        printHelloWorld();
    }

    // 在main方法下定义一个方法
    public static int getSum(int a, int b) {  // 考虑方法 是否需要 接收数据 和 返回数据； 需要，则需定义形参的类型 和 返回值的类型
        return a + b;
    }

    // 需求：打印3行HelloWorld，不需要参数，不需要返回值
    // 注意：如果方法没有返回结果（数据），返回值类型必须声明成void
    // 无参数 --> 无返回值
    public static void printHelloWorld() {
        // 注：仅打印时，在main方法中调用时，直接调用方法即可，不需要再用变量去接收结果
        System.out.println("HelloWorld");
        System.out.println("HelloWorld");
        System.out.println("HelloWorld");
    }


}
