package com.weirui.select;

public class For01 {
    public static void main(String[] args) {

//        for (int i = 0; i < 10; i++) {
//            System.out.println("人民万岁" + '\t' + + i);
//        }

        /*
        * for的另一种写法 --> 好处：扩大了变量i的作用域范围
        * */
        int i = 0; //
        for (; i < 10;) {
            System.out.println("人民万岁！" + '\t' + i);
            i++;
        }
        System.out.println("i的值为：" + i); // 该值为for循环中 ( i < 10 ) 的判断部分的boolean值为false时，跳出for循环 ：10

        /*
        * for的第三中写法
        * */
        for (;;) { // for循环的圆括号只有两个分号，表示--> for语句无限循环（死循环） 死循环一般配合break一起使用
            System.out.println("该语句块处无限循环");
        }
    }
}
