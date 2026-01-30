package com.weirui.select;

public class DoubleFor06 {
    public static void main(String[] args) {
        int count = 0;
        while (true) { // 恒为真
            int randomNum = (int) (Math.random() * 100) + 1;
            count++;
            if (randomNum == 97) {
                break;
            }
        }
        System.out.println("生成97这个数字共用了" + count + "次");
    }
}
