package com.weirui.exersize;

import java.util.Scanner;

public class Exersize09 {
    public static void main(String[] args) {

//        静态数组定义的三种方式
//      方式一：
//        int[] ascending = new int[]{0,12,45,90};

//      方式二：
//        int[] ascending = {0,12,45,90};

//        方式三：
//        int[] ascending;
//        ascending = new int[]{0,12,45,90};

//        动态一维数组 ： ---> 需要指定数组的大小
//        方式一：
//        int[] arr = new int[3];
//
//        方式二：
//        int[] arr;
//        arr = new int[3];
//
//

        /*题目：
    * 4.已知有个升序的数组,要求插入一个元素,该数组顺序依然是升序,比如:
         [10,12,45,90],添加23后,数组为[10, 12, 23, 45, 90]
    * */

        int[] ascending = {10,12,45,90};
//       1. 插入一个元素

//        定义一个新的一维数组ascendingNew, 它的大小 > ascending.length == ascending.length + 1
        int[] ascendingNew = new int[ascending.length + 1];
//        输入要被插入的数组元素
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要插入的数组元素：");
        int ele = sc.nextInt();
        ascendingNew[ascendingNew.length - 1] = ele;
//      把旧数组的元素拷贝到新数组中
        for (int i = 0; i < ascending.length; i++) { // 遍历旧数组
            ascendingNew[i] = ascending[i];
        }
//        用旧数组指向新数组 ---> 此时 新旧数组的地址同时指向ascendingNew的地址 ，而原先ascending由于没有被其他数组指向 因此在堆区销毁
        ascending = ascendingNew;

//        查看新数组中的元素
//        for (int i = 0; i < ascendingNew.length; i++) {
//            System.out.print(ascendingNew[i] + " ");
//        }

//        2.冒泡排序
        for (int i = 0; i < ascendingNew.length - 1; i++) { // i: 控制轮数
            for (int j = 0; j < (ascendingNew.length - i - 1); j++) { // j:控制比较次数
//                数组相邻两个元素进行比较 : 前一个数 > 后一个数 ---> 交换 ；否则，不交换
                if (ascendingNew[j] > ascendingNew[j + 1]) {
                    int tmp = 0;
                    tmp = ascendingNew[j + 1];
                    ascendingNew[j + 1] = ascendingNew[j];
                    ascendingNew[j] = tmp;
                }
            }
        }
//        数组ascendingNew中的所有元素交换完后，来到这里

//        遍历
        for (int i = 0; i < ascendingNew.length; i++) {
            System.out.print(ascendingNew[i] + " ");
        }
    }
}
