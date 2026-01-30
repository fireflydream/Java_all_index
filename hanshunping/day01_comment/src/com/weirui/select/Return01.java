package com.weirui.select;

public class Return01 {
    public static void main(String[] args) {
        /*
        *  return : 表示 ---> 跳出return所在的方法。 若return在main中，则表示结束程序
        * */

        for (int i = 0; i < 5; i++) {
            if (i == 2) {
                System.out.println("人民万岁");
                return; // return在main方法中，表示结束该程序
            }
            System.out.println(i); // 0 1 人民万岁
        }
    }
}
