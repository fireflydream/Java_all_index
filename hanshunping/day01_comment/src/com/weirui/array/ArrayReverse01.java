package com.weirui.array;

public class ArrayReverse01 {
    public static void main(String[] args) {
//        学计算机 ---> 其实也是需要做题 （数学题）

        /*
        * 要求：把数组的元素内容翻转
        * */
        int[] arr = {11, 22, 33, 44, 55, 66};
//                   0   1   2   3   4   5
//        思路：
//        1. arr[0] 和 arr[5] 进行交换 ---> {66, 22, 33, 44, 55, 11}
//        2. arr[1] 和 arr[4] 进行交换 ---> {66, 55, 33, 44, 22, 11}
//        3. arr[2] 和 arr[3] 进行交换 ---> {66, 55, 44, 33, 22, 11}
//      ---> 一共要交换 3次  <==> 数组arr长度的一半  <==> arr.length / 2
//        4. 每次交换时，对应的下标 是 arr[i] 和 arr[arr.length - 1 - i]
//                                 arr[0]   arr[6 - 1 - 0 ] <==> arr[5]

        for (int i = 0; i < arr.length / 2; i++) {
            int tmp = 0; // 想一想：为什么这次定义的一个临时变量要放到for循环里面？  ---> 原因：每次交换后都需要一个新的临时变量
            tmp = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = arr[i];
            arr[i] = tmp;
        }
//        逆序
        System.out.println("逆序后的新数组：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " "); // 在for循环里面遍历数组时，就不用换行了
        }
    }
}
