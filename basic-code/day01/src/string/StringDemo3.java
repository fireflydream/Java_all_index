package string;


import java.util.Scanner;

public class StringDemo3 {
    public static void main(String[] args) {
        // 1. 定义两个变量用来记录正确的用户名和密码
        String rightUserName = "weirui";
        String rightPassword = "123456";

        // 给三次登录机会 --也就是循环三次 （把第2步和第3步重复3次）
        //循环和分支语句的快捷键：ctrl + alt + t ， 但我们一般用 n.fori (其中n表示的是次数)
        // 好习惯：我们在测试代码时，不仅要测试正确的，也要测试错误的

        for (int i = 0; i < 3; i++) { // 0 1 2
            // 2. 键盘录入 用户名和密码
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入用户名:");
            String userName = sc.next();
            System.out.println("请输入密码：");
            String password = sc.next();

            // 3. 判断用户名和密码是否正确  -- equals
            if (rightUserName.equals(userName) && rightPassword.equals(password)) {
                System.out.println("登录成功");
                break; // 跳出循环
            }else {
                if (i == 2) {
                    System.out.println("密码错误，账号已被锁定");
                }else {
                    System.out.println("用户名或密码错误,请重新登录.此时你还剩下" + (2-i) + "次机会");
                }
                /*if (i == 2) {
                    System.out.println("密码错误，账号已被锁定");
                    break;
                }
                System.out.println("用户名或密码错误,请重新登录.此时你还剩下" + (2-i) + "次机会"); // 2 1 0*/
            }
        }
    }
}
