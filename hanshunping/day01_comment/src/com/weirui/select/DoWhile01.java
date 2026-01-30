package com.weirui.select;

public class DoWhile01 {
    public static void main(String[] args) {
        /* int i = 0;
        *  do{
        *  // 语句块
        * i++;
        * }
        *  while(判断部分)
        * */

        int i = 1;
        int n = 10;
        do {
            System.out.println("人民万岁" + i);
            i++;
        }while (i <= n);
        System.out.println("退出do..while 继续执行");
    }
}
