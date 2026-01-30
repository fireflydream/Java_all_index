package com.weirui.select;

import java.lang.classfile.Label;

public class Continue01 {
    public static void main(String[] args) {
        /*
        *  continue : 跳过contunue下面的代码，直接来到循环语句的迭代部分（i++）
        * */
        label1:
        for (int i = 0; i < 10; i++) {
            if (i == 2) {
                continue; // 跳到 label1 处，执行迭代部分（i++）
            }
            System.out.print(i + " "); // 0 1 3 4 5 6 7 8 9
        }
    }
}
