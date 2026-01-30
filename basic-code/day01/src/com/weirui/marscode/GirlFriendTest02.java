package com.weirui.marscode;


public class GirlFriendTest02 {
    public static void main(String[] args) {
        // 创建一个 GirlFriend 对象
        GirlFriend02 gf = new GirlFriend02();

        // 当设计图（javabean类）的成员属性（变量）被封装时
        // 给成员属性赋值 --要用set方法和get方法
        gf.setName("刘浩存");
        gf.setAge(25);
        gf.setHeight(1.65);
        gf.setGender('女');



        // 打印成员属性
        System.out.println(gf.getName());
        System.out.println(gf.getAge());
        System.out.println(gf.getHeight());
        System.out.println(gf.getGender());


        // alt + shift + 鼠标左键 ：实现多行修改
        // 或 按住鼠标滚轮不松 + 上下移动

        // 调用成员方法
        gf.sleep();
        gf.eat();
        gf.coquetry();
    }
}
