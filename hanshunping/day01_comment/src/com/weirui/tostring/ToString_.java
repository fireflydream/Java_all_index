package com.weirui.tostring;

public class ToString_ {
    public static void main(String[] args) {
        Monster monster = new Monster("怪兽", "搞破坏", 2000);
        // Monster类中没有重写toString方法
        // 因此，toString默认调用的Object类里面的toString方法

        // 重写toString方法
        System.out.println(monster.toString());
        // 当直接输出一个对象时，toString方法会被默认的调用
        System.out.println(monster);
    }

}
