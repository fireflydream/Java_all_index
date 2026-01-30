package com.weirui.array;

public class ArrayCopy01 {
    public static void main(String[] args) {
//    将int[] arr1 = {10， 20， 30}；拷贝到arr2里面

        /*
        * 数组和for循环是搭配在一起使用的，且 for循环中的判断部分需要修改成arr.length
        * */
        int[] arr1 = {10, 20, 30};
        int[] arr2 = arr1;
        arr2[0] = 100;
        System.out.println("arr2的值：");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}
