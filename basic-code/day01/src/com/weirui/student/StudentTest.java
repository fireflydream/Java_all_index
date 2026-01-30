package com.weirui.student;

import java.sql.SQLOutput;

public class StudentTest {
    public static void main(String[] args) {
        // 创建第一个学生对象，同时自动调用该构造方法
         Student s1 = new Student(); // 调用空参构造

        // 创建第二、三个学生对象，通过赋值的方式调用有参构造
        Student s2 = new Student("刘浩存", 25);
        Student s3 = new Student("刘亦菲", 18);

        // 打印属性的值
        System.out.println(s2.getName());
        System.out.println(s2.getAge());

        System.out.println(s3.getName());
        System.out.println(s3.getAge());
    }



}
