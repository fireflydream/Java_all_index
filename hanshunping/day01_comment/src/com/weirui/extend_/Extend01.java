package com.weirui.extend_;

import javax.naming.Name;

public class Extend01 {
    public static void main(String[] args) {
        Pupil pupil = new Pupil("张三", 23);

        System.out.println("姓名："+ pupil.name + " " +
                "年龄：" +pupil.age);
        // 对子类中的属性进行赋值
        /*pupil.name = "圆嘟嘟";
        pupil.age = 10;
        pupil.setScore(60);
        // 调用方法，并输出
        pupil.testing();
        System.out.println(pupil.info());

        System.out.println("=========================");

        UnderGraduate underGraduate = new UnderGraduate();
        // 对子类中的属性进行赋值
        underGraduate.name = "本科生";
        underGraduate.age = 23;
        underGraduate.setScore(99);
        underGraduate.testing();
        System.out.println(underGraduate.info());*/
    }
}
