package com.weirui.array;

public class ArrayAssign01 {  // 数组赋值
    public static void main(String[] args) {
        /*
         * 基本数据类型 --> 传值调用
         * 数组（引用数据类型） --> 传址调用
         * */
//    1.传值调用
        int a = 10;
        int b = a;
        // 修改变量b的值
        b = 88;

        System.out.println("a = " + a); // 10
        System.out.println("b = " + b); // 88
//        通过上面的代码可知：传值调用 第二个变量的值变化 不会影响到 第一个变量的值

//        2.传址调用
        char[] arr1 = new char[5];
        char[] arr2 = arr1; // arr2 指向 arr1

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (char) ('A' + i);
        }
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = (char) ('F' + i);
        }
        System.out.print("arr1的值：");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " "); // F G H I J
        }
        System.out.println();
        System.out.print("arr2的值：");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " "); // F G H I J
        }
//        通过上面的代码可知：传址调用 --> 第二个数组的值变化 会影响到 第一个数组的值
//        怎么影响？  ---> 因为 数组的本质是指针 所以 第二个数组发生变化 ： 它会指向 第一个数组 把值拷贝到第一个数组中
    }
}
