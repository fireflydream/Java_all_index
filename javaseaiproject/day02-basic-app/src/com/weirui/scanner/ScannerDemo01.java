package com.weirui.scanner;
//1.导包：告诉我们的程序，去jdk的哪里找Scanner程序用
import java.util.Scanner;
public class ScannerDemo01 {
    public static void main(String[] args) {
        printUserInfo();
    }
    // 需求：我是一个零基础小白，请帮我写一个程序，让用户键盘输入用户名和年龄，然后打印下来
    public static void printUserInfo() {
        //2.创建一个Scanner对象
        Scanner sc = new Scanner(System.in);

        //3.获取用户输入
        System.out.println("请输入用户名：");
        // 让程序在这一行暂停，等待用户输入字符串名称，知道按了回车键之后，把名字交给变量username之后再往下走
        String username = sc.next();
        System.out.println("用户名：" + username);

        System.out.println("请输入年龄：");
        int age = sc.nextInt();
        System.out.println("年龄：" + age);
    }


}
