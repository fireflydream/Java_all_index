package com.weirui.comment;

public class Test03 {
    public static void main(String[] args) {
        // 定义一个数组并初始化
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        // 调用copyArray方法，并返回一个新数组
        int newArr[] = copyArray(arr, 2, 5);

        // 打印新数组
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }

    }
    // 定义一个方法，将原数组中的部分元素赋值到新数组中
    public static int[] copyArray(int arr[], int start, int end) {
        // 创建一个新数组，并赋值
        int newArr[] = new int[end - start];
        // 伪造索引思想  --给新数组创建一个初始元素的空间，然后依次将元素复制到新数组中
        int index = 0;
        for (int i = start ; i < end; i++) {
            newArr[index] = arr[i];
            index++;
        }
        return newArr;
    }
}
