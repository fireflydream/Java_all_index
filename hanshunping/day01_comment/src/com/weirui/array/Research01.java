package com.weirui.array;

import java.util.Scanner;

public class Research01 {
    public static void main(String[] args) {
//        定义一个字符串数组
        String[] gussGame = {"白眉鹰王", "金毛狮王", "紫衫龙王", "青翼蝠王"};
        Scanner sc = new Scanner(System.in);
        System.out.println("请任意输入一个名称，判断该数组中是否包含这个名称");
        String name = sc.next();
        int index = -1; // 这是一个重要的编程思想 ： 它是在遍历数组元素和字符串比较的时候用到这个思想
        for (int i = 0; i < gussGame.length; i++) {
            if (name.equals(gussGame[i])) {
                System.out.println("找到了" + "该下标为：" + i);
                index = i;
                break;
            }
        }
        // 把整个数组里面的元素都和这个name字符串比较完了，都没有找到这个名称。此时，我们提示：该数组没有包含这个名称
        if (index == -1) {
            System.out.println("没有找到" + name);
        }
    }
}
