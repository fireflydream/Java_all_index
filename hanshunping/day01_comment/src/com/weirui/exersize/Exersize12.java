package com.weirui.exersize;

import java.util.Scanner;

// 在实际开发过程中，一个java文件只有一个类
// 此处的.java文件中包含多个类，这并不规范。仅做教学使用。日后需要规范处理

public class Exersize12 {
    public static void main(String[] args) {
        /*
                * 看一个养猫猫问题
        张老太养了两只猫猫:一只名字叫小白,今年3岁,白色。还有一
        只叫小花,今年100岁,花色。请编写一个程序,当用户输入小
        猫的名字时,就显示该猫的名字,年龄,颜色。如果用户输入
        的小猫名错误,则显示张老太没有这只猫猫。
        * */

//        1. 实例化一只猫 [创建一只猫对象]
        Cat cat1 = new Cat();  // new + 引用数据类型（如：数组）/ 方法名
//        1. new Cat() 创建一只猫
//        2. Cat cat1 = new Cat(); 把 "创建一只猫" 这个对象 赋给 类（名）
//        3. cat1 就是一个对象

//        给第一只猫赋值
//        类名.成员变量 ---> 赋值
        cat1.name = "小白";
        cat1.age = 3;
        cat1.coatColor = "白色";

//        类名 == 实例化的一个对象 == 方法

//        2. 实例化第二只猫
        Cat cat2 = new Cat();
//        给第二只猫赋值
        cat2.name = "小花";
        cat2.age = 100;
        cat2.coatColor = "花色";

//        3.怎么访问对象的属性呢？
        System.out.println("第一只猫的信息：" + cat1.name + " " + cat1.age + " " + cat1.coatColor);
        System.out.println("第二只猫的信息：" + cat2.name + " " +cat2.age + " " + cat2.coatColor);


//        现在的方法： ---> 类 和 对象
//        什么是  类和对象？
//        类是一个抽象的事物 而对象是这个抽象事物中的具体事务
//        类 和 对象 并非一成不变的；在我们的生活中事物之间往往是相对的。
//        如： 交通工具 vs 汽车 --> 此时， 交通工具 就是 类 ； 汽车 就是 对象
//             汽车 vs 特斯拉  ---> 此时  汽车 就是 类 ； 特斯拉 就是 对象
//
//     ---> class 类名 {} 是我们自定义的一个数据类型
//        而 如：int、double等这些基本数据类型 都是java提前写好，然后再提供给我们用的 【预装】

//        注意：类不能嵌套在类中
//        class cat {
//            String name;
//            int age;
//            String coatColor; // 定义一个变量来表示猫的颜色
//        }


//        传统方法
//        1.告诉编译器：有两只小猫
//        String cat = "小白";
//        int age = 3;
//        String color = "白色";
//
//        String cat2 = "小花";
//        int age2 = 100;
//        String color2 = "花色";
////        2.键盘录入
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入小猫的名字：");
//        String name = sc.next();
//        if (name.equals(cat) || name.equals(cat2)) {
//            System.out.println("该猫的名字：" + name);
//        }else {
//            System.out.println("张老太没有这只猫");
//        }
    }
}
// 定义一个猫类
// 定义完后，我们需要去main方法中实例化这个类的对象
class Cat {  // 注意：类名 和 文件名 采用的是 大驼峰的命名方式
//    属性（成员变量）
    String name;
    int age;
    String coatColor; // 定义一个变量来表示猫的颜色

//    行为（成员方法）
}
