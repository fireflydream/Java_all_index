package string;

import java.util.Scanner;

public class StringDemo2 {
    public static void main(String[] args) {
        // 键盘录入一个字符串
        Scanner sc  = new Scanner(System.in);
        System.out.println("请输入一个字符串:");
            String str1 = sc.next(); //点击next方法，按ctrl+B 查看方法定义

        // 再定义一个字符串
        String str2  = "abc";

        // 用 == 判断两个字符串是否相等
        System.out.println(str1 == str2); // false 因为引用数据类型比较的是地址值，而不是数据值

        // 总结：以后只要是想比较字符串中的内容，就要用string里面的方法，不要用== .
    }
}
