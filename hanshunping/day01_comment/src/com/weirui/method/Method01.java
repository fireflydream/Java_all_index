package com.weirui.method;

import java.util.Scanner;

public class Method01 {
    public static void main(String[] args) {
        /*
        * 成员方法 ：简称 方法
        * */
//        实例化一个对象，并赋值给p1
        Person p1 = new Person();
//        调用类p1里面的speak()方法
        System.out.println(p1.speak());
//        p1这个类来调用cal01()
        System.out.println("1 + …… + 1000的值：" + p1.cal01(100));
//         p1这个类来调用getSum()
        System.out.println("两数和为：" + p1.getSum());
    }
}

//    1.定义一个Person类
class Person {
    // 属性

    // 行为
    public String speak() {
        String state = "我是一个好人";
        return state;
    }
    public int cal01(int n) {  // n : 形参列表 由main方法中的实际参数来进行输入。这个实际参数在 “类名.cal01(实参)"
        int sum = 0;
        for (int i = 1; i <= n; i++) { // i: 控制项数
            sum += i;
        }
        return sum;
    }
    public int getSum() {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数：");
        int num1 = sc.nextInt();
        System.out.println("请输入第二个数：");
        int num2 = sc.nextInt();
        sum = num1 + num2;
        return sum;
    }
}
