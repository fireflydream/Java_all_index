package com.weirui.array;

import java.util.Scanner;

public class ArrayAdd02 {
    public static void main(String[] args) {
        /* 题目
         * 要求：实现动态的给 数组添加元素效果，实现对数组扩容
         * 1) 原始数组使用静态分配 int[] arr = {1, 2, 3};
         * 2) 增加的元素4，直接放在数组的最后 arr = {1, 2, 3, 4};
         * 3) 用户可以通过如下方法来决定是否继续添加，添加成功，是否继续？ y/n
         * */

        int[] arr = {1, 2, 3};
        Scanner sc =new Scanner(System.in);
       do {
           System.out.println();
           System.out.println("请输入你想要增加的元素：");
           int elementAdd = sc.nextInt();
//        创建一个新数组 ---> 数组扩容 arr --> arrNew
           int[] arrNew = new int[arr.length + 1];
//        把原先的数组arr里面的元素拷贝到数组arrNew中
           for (int i = 0; i < arr.length; i++) {
               arrNew[i] = arr[i];
           }
//        把新增元素存储到arrNew中
           arrNew[arrNew.length - 1] = elementAdd;
//        最关键的一步 --- > 数组扩容
           arr = arrNew;
           System.out.print("arr的元素：");
           for (int i = 0; i < arrNew.length; i++) {
               System.out.print(arr[i] + " ");  // arr扩容成功！
           }
       }while (true);
    }
}
