package com.weirui.select;

import java.util.Scanner;

public class DoubleFor07 {
    public static void main(String[] args) {
        String corretUsername = "丁真";
        String corretPwd = "666";
        Scanner sc = new Scanner(System.in);
        for (int i = 3; i > 0; i--) {
            System.out.println("正在登录验证，请输入用户名：");
            String userName = sc.next();
            System.out.println("请输入密码：");
            String pwd = sc.next();

            // 要把字符串写在equal()方法前面，避免空指针！！！
            if (corretUsername.equals(userName) && corretPwd.equals(pwd)) {
                System.out.println("登录成功");
                break;
            }else {
                int remaining = i - 1; // 声明一个变量来存储剩余次数
                if (remaining > 0) {
                    System.out.println("用户名或密码错误，还剩" + remaining + "次机会");
                }else {
                    System.out.println("三次机会已用完，登录失败");
                }
            }
        }
    }
}
