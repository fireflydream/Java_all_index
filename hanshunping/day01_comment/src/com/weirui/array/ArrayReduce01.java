package com.weirui.array;

public class ArrayReduce01 {
    public static void main(String[] args) {
        /*
        * 有一个数组 {1, 2, 3, 4, 5}，可以将该数组进行缩减，提示用户是否继续缩减，每次缩减最后那个元素。
        * 当只剩下最后一个元素，提示，不能再缩减。
        * */

        int[] arr = {1, 2, 3, 4, 5};
        do {
    //        1. 创建一个新数组
    int[] arrSmall = new int[arr.length - 1];
    //        拷贝
    for (int i = 0; i < arrSmall.length; i++) {
        arrSmall[i] = arr[i]; // 大数组 拷贝到 小数组 中，不会发生内存溢出，只强行截断末尾的元素
    }
//      关键：  数组缩减
    arr = arrSmall;

//        遍历
            System.out.print("arr的元素：");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " "); // 在for循环中，我们打印数组元素时不换行，只拼接一个空格
            }
            System.out.println();
            if (arr.length == 1) {
                System.out.println("数组arr只剩下最后一个元素,不能再缩减");
                break;
            }
        }while (true);
    }
}
