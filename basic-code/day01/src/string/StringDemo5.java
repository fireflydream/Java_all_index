package string;

import java.util.Scanner;

public class StringDemo5 {
    public static void main(String[] args) {
        // 1. 键盘录入一个字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = sc.nextLine(); // abcDefG

        // 遍历的好处 ： ① 可以获取字符串中每一个字符 ② 可以获取字符的索引
        // 通过遍历，可以进行 “统计字符个数”、“拼接字符串”、“字符串反转” （如：abc --> cba）

        // 2. 统计 --计数器思想
        int bigCount = 0;
        int smallCount = 0;
        int numberCount = 0;
        int otherCount = 0;

        // 3. 遍历这个字符串
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'a' && c <= 'z') {// 字符在参与运算时，会自动提升为int. 所以编译器在底层会把字符转换成ASCII码进行运算
                smallCount++;
            } else if (c >= 'A' && c <= 'Z') {
                bigCount++;
            }else if (c >= '0' && c <= '9') {
                numberCount++;
            }else {
                otherCount++;
            }
        }
        // 输出
        System.out.println("大写字母的个数：" + bigCount);
        System.out.println("小写字母的个数：" + smallCount);
        System.out.println("数字的个数：" + numberCount);
        System.out.println("其他字符的个数：" + otherCount);
    }
}
