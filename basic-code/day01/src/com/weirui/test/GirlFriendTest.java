package com.weirui.test;

public class GirlFriendTest {
    public static void main(String[] args) {
        // 创建一个 GirlFriend 对象
        GirlFriend gf = new GirlFriend();

        // 当设计图（javabean类）的成员属性（变量）被封装时
        // 给成员属性赋值 --要用set方法和get方法
        gf.name = "刘浩存";
        gf.age = 25;
        gf.height = 1.65;
        gf.gender = '女';



        // 打印成员属性
        System.out.println(gf.name);
        System.out.println(gf.age);
        System.out.println(gf.height);
        System.out.println(gf.gender);

        // alt + shift + 鼠标左键 ：实现多行修改
        // 或 按住鼠标滚轮不松 + 上下移动

        // 调用成员方法
        gf.sleep();
        gf.eat();
        gf.coquetry();
    }
}
