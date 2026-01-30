package com.weirui.select;

import java.io.Console;

import java.util.Scanner;
import java.io.Console;

public class DoubleFor08 {
    public static void main(String[] args) {
        String correctUsername = "丁真";
        String correctPassword = "666";
        boolean loginSuccess = false;

        // 循环：3次登录机会
        for (int i = 3; i > 0; i--) {
            // 1. 输入用户名（正常显示）
            Scanner scanner = new Scanner(System.in);
            System.out.print("请输入用户名：");
            String username = scanner.next();

            // 2. 输入密码（模拟隐藏：显示*）
            System.out.print("请输入密码：");
            String password = getHiddenPassword(); // 调用自定义方法

            // 3. 验证逻辑
            if (username.equals(correctUsername) && password.equals(correctPassword)) {
                System.out.println("\n登录成功！");
                loginSuccess = true;
                break;
            } else {
                int remaining = i - 1;
                if (remaining > 0) {
                    System.out.println("\n用户名或密码错误，还有" + remaining + "次机会");
                } else {
                    System.out.println("\n3次机会已用完，登录失败");
                }
            }
        }
    }

    // 自定义方法：模拟密码隐藏（输入时显示*）
    private static String getHiddenPassword() {
        String password = "";
        try {
            // 获取键盘输入的字节流
            java.io.InputStream in = System.in;
            int ch;
            while ((ch = in.read()) != '\n' && ch != '\r') { // 直到输入回车
                if (ch != 8) { // 排除退格键
                    password += (char) ch;
                    System.out.print("*"); // 输入一个字符，显示一个*
                } else { // 处理退格键
                    if (password.length() > 0) {
                        password = password.substring(0, password.length() - 1);
                        // 退格后删除一个*（控制台回退+删除+回退）
                        System.out.print("\b \b");
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return password;
    }
}
