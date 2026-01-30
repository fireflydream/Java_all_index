package com.weirui.comment;

// 类 和 方法名 都需要用文档注释

import java.util.Scanner;

/**
 * @author 李超
 * @version 1.0
 */
public class Comment {
    public static void main(String[] args) {
        System.out.println("你好，李超");
        double num = .123; // 0.123可以写成.123（小数点前面的0可以省略）
        System.out.println("----------");
        System.out.println(5.20e2);// 5.20e2 --> 5.20 * 10^2
        System.out.println(5.20e-2);// 5.20e-2 --> 5.20 * 10^-2

        System.out.println("----------");
        char num2 = 97; // 字符类型可以存放一个数字
        System.out.println(num2); // 输出的是--> 97这个数字在ASCII表中的那个对应的字符

        // 在java中， char的本质是一个整数。在默认输出时，是Unicode码对应的字符
        // 要输出对应的数字，可以(int)字符
        char num3 = '李';
        System.out.println((int) num3);
        // 正因char的本质是一个整数，因此 char类型的变量是可以进行运算的
        char n = 'a';
        char num4 = 30;
        System.out.println(n - num4);

        System.out.println("--------");
        boolean isPass = true;
        if(isPass) {
            System.out.println("考试通过");
        }else {
            System.out.println("考试未通过");
        }
        System.out.println("-----------");

        // 基础数据类型 <---> 字符串类型(String) 的相互转换
        int n1 = 123;
        double n2 = 3.14;
        float n3 = 15.16f;
        // 基础数据类型 --> 字符串类型 ：拼接一个 “” 即可
        String s1 = n1 + "";
        String s2 = n2 + "";
        String s3 = n3 + "";
        //System.out.println(s1 + "" + s2 + "" + s3 + "");
        System.out.println("" + s1 + s2 + s3);

        // 字符串类型 --> 基础数据类型 ：调用包装类
        String s4 = "123";
        int i1 = Integer.parseInt(s4);
        double i2 = Double.parseDouble(s4);
        float i3 = Float.parseFloat(s4);
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println("--------------");
        /*
        * 用变量将姓名、年龄、性别、成绩、爱好存储并输出
        * */
        String name = "李超";
        int age = 23;
        char gender = '男';
        double score = 88.8;
        String hobby = "喜欢写代码";
        // 当一行代码过长，我们需要人为地将它换行
        System.out.println("姓名\t年龄\t性别\t成绩\t\t爱好\n" + name + "\t" + age + "\t" +
                gender + "\t" + score + "\t" + hobby);

        /*
        * 关系运算符（> < == >= <= !=）和 逻辑运算符（& | && || ^ !）的表达式结果为--> 布尔值（true false）
        *
        * */
        int number1 = 10;
        int number2 = 12;
        boolean flag1 = number1 > number2; // false
        boolean flag2 = number1 >= number2; // false
        boolean flag3 = number1 < number2; // true
        boolean flag4 = number1 <= number2; // true
        boolean flag5 = number1 == number2; // false
        boolean flag6 = number1 != number2; // true
        System.out.println(flag1);
        System.out.println(flag2);
        System.out.println(flag3);
        System.out.println(flag4);
        System.out.println(flag5);
        System.out.println(flag6);

        /*
        *  && ：短路与
        *  ||：短路或
        * */
        boolean flag7 = flag3 ^ flag2; // ^ : true ^ false --> true "不同为true"
        System.out.println(flag7); // true

        System.out.println("------------");
        /*
        * 四种进制（二进制 八进制 十进制 十六进制）
        * 二进制：以0b开头
        * 八进制：以0开头
        * 十六进制：以0x开头
        * */

        int a1 = 0b1010; // 10
        int a2 = 01070; // 1 * 8^3 + 7 * 8^1 --> 568
        int a3 = 0x10AF; // 1 * 16^3 + 10 * 16^1 + 15 * 16^0 --> 4271
        System.out.println("a1 = " + a1 + "\t\t" + "a2 = " + a2 + "\t\t" + "a3 = " + a3);

        System.out.println("------");
        /*
        *
        * */
        // 创建一个Scanner对象（扫描器）--> 键盘输入 ，赋给变量sc
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入歌手的初赛成绩：");
        double score2 = sc.nextDouble();
        if (score2 > 8.0) {
            System.out.println("请选择歌手的性别：");
            char gender2 = sc.next().charAt(0);

            if (gender2 == '男') {
                System.out.println("决赛进入男子组");
            }else {
                System.out.println("决赛进入女子组");
            }
        }else {
            System.out.println("淘汰");
        }
    }
}
