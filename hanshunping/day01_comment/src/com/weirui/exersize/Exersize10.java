package com.weirui.exersize;

import java.util.Random;
import java.util.Scanner;

public class Exersize10 {
    public static void main(String[] args) {
        /*
        * 随机生成10个整数（1~100的范围）保存到数组，并倒序打印以及求平均值、求最大值和最大值的下标，并查找里面是否有8
        * */

//        1.随机生成10个整数（1~100的范围）保存到数组
        int[] arr = new int[10]; // 定义一个动态的一维数组，大小为10
        for (int i = 0; i < 10; i++) {
//              随机生成一个整数
                int ele = (int) (Math.random() * 100) + 1;
//             每生成一个整数后，就把它存储到数组中
                arr[i] = ele; // 数组arr接收每一个整数

//            随机生成一个整数
//            方式一：
//            Random r = new Random();
//            int ele = r.nextInt(100) + 1;
//
//            方式二：
//            int ele2 = (int) (Math.random() * 100) + 1;
        }

//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }

//        2.倒序
//        冒泡排序
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int tmp = 0; // tmp 放外层for循环外面 还是 内层for循环里面 都是可以的 ---> 原因：交换完后tmp里面不存放任何数据
                    tmp = arr[j + 1] ;
                    arr[j + 1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        // 排序完后，继续执行下面的代码
//        遍历输出
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
//       3.求该数组的平均值
        int sum = 0;
        int avg = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        avg = sum / arr.length;
        System.out.println();
        System.out.println("该数组的平均值：" + avg);
//       4. 最大值
        int max = arr[0]; // 假设第一个数组元素为最大值
//        1 2 3 4 5
        int index = -1;
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("该数组的最大值：" + max + ", ");
//       5. 最大值的下标
        for (int i = 0; i < arr.length; i++) {
            if (max == arr[i]) {
                index = i;
            }
        }
        System.out.print("对应的下标:" + index);
        System.out.println();
//       6. 查找该数组中是否有8
          int seekNum = 0; // 定义一个变量来存储8
        for (int i = 0; i < arr.length; i++) {
            if (8 == arr[i]) {
                // 用变量eight来存储查找到的这个数字
                seekNum = arr[i];
                break;
            }
        }

        if (seekNum == 8) {
            System.out.println("该数组中有" + seekNum);
        }else {
            // 遍历完后，发现该数组中没有8
            System.out.println("该数组中没有8");
        }
    }
}
