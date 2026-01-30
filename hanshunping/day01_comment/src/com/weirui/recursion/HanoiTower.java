package com.weirui.recursion;

public class HanoiTower {
    public static void main(String[] args) {
        Tower t = new Tower();
        t.move(5,'A', 'B', 'C');
    }
}
// 定义一个I类
class Tower {
    // 行为
    // num : 盘子的数量
    // a b c :3个塔名
    public void move(int num, char a, char b, char c) {
        if (num == 1) {
            System.out.println(a + "--->" + c);
        }else {
            // a塔上有多个盘子 ---> 把所有盘子看成2部分（最底下为一部分，其余盘子为一部分）
            // 1. 先移动a塔上一部分的盘子到b塔上 ，借助c
            move(num - 1, a, c, b); // a --> b 借助c
            // 2. 再把a塔下部分的盘子移动到c塔
            System.out.println(a + "--->" + c);
            // 3. 最后把b塔上的盘子移动到c，借助a
            move(num - 1, b, a, c);
        }
    }
}