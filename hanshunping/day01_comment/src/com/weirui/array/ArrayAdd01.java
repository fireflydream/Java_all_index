package com.weirui.array;

import java.util.Scanner;

public class ArrayAdd01 {
    public static void main(String[] args) {
        /* 题目
        * 要求：实现动态的给 数组添加元素效果，实现对数组扩容
        * 1) 原始数组使用静态分配 int[] arr = {1, 2, 3};
        * 2) 增加的元素4，直接放在数组的最后 arr = {1, 2, 3, 4};
        * 3) 用户可以通过如下方法来决定是否继续添加，添加成功，是否继续？ y/n
        * */

//        思路：
//        1. 定义一个数组 int[] arr = {1, 2, 3};
//        2. 怎么增加？  --->  可以创建一个新数组，新数组的大小仅比arr大1  int[] arrNew = new int[arr.length + 1];
//        3. 遍历数组arr，把arr里面的内容拷贝到arrNew
//        4. 将4发给arrNew[arrNew.length - 1]
//        5. 让arr指向arrNew; 那么原来arr这个数组里面的内容就被销毁了  ---> 传址调用
//        6. 遍历数组
//        7. 创建一个scanner来接收用户的添加
//        8. 思考：用户需要添加几次我们是不知道的，什么时候退出我们也是不知道的。 ---> 因此，我们需要给它设计一个循环语句来控制添加
//           do..while + break

        Scanner sc = new Scanner(System.in);
        do {
            int[] arr = {1, 2, 3};
            int[] arrNew = new int[arr.length + 1];

            for (int i = 0; i < arr.length; i++) {
                arrNew[i] = arr[i];
            }
            arrNew[arrNew.length - 1] = 4;
            arr = arrNew; // 让arr指向arrNew ---> 这一步才是真正地让数组arr扩容！ ; 那么原来arr这个数组里面的内容就被销毁了

            System.out.print("arr的值：");
            for (int i = 0; i < arrNew.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println(); // 换行

            System.out.println("是否还要继续添加新元素？" + "y/n");
            char select = sc.next().charAt(0);
            switch (select) {
                case 'y':
                    int[] arrNew2 = new int[arrNew.length + 1];
                    // 把arrNew的内容拷贝到arrNew2
                    for (int i = 0; i < arrNew.length; i++) {
                        arrNew2[i] = arrNew[i];
                    }
                    System.out.println("请输入你想添加的新元素：(仅限整数)");
                    int newElement = sc.nextInt();
                    arrNew2[arrNew2.length - 1] = newElement;
                    // 让arrNew 指向 arrNew2
                    arrNew = arrNew2; //
//                    遍历arrNew2
                    for (int i = 0; i < arrNew2.length; i++) {
                        System.out.print(arrNew[i] + " ");
                    }
                    break; // 跳出switch语句
                case 'n':
                    break; // 跳出switch语句
                default:
                    System.out.println("输入错误，请重新选择");
            }
            // 这里：还要再问 ：51行的代码
            break; // 跳出while语句
        }while (true);

    }
}
