package com.weirui.recursion;

public class Recursion04 {
    /* 猴子吃桃子问题：
    * 1.有一堆桃子，猴子第一天吃了其中的一半，并再多吃了1个！
    * 以后每天猴子都吃其中的一半，然后再多吃一个。当到第 10 天时，想再吃时即还没吃发现只有 1 个桃子了。问题：最初共多少个桃子？
    *
    * day10: (day9 + 1) * 2 ---> 4
    * day9 : (day8 + 1) * 2 ---> 10
    * 规律：前一天的桃子 = （后一天的桃子 + 1） * 2
    * */
    public static void main(String[] args) {
        G g = new G();
        int day = 10;
        int res = g.eatPeach(day);
        System.out.println(res);

    }
}
// 定义一个G类
class G {
    // 行为
    public int eatPeach(int day) {
        if (day > 0) {
            if (day == 10) {
                return 1;
            }else if (day >= 1 && day <= 9) {
                return (eatPeach(day + 1) + 1) * 2;
            }
        }else {
            System.out.println("day只能在1-10");
            return -1; // 返回一个默认值，避免编译器报错
        }
        return -1;
    }
}
