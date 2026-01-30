package string;

import java.util.Scanner;

public class StringDemo8 {
    public static void main(String[] args) {
        // 1. 键盘录入一个金额
        Scanner sc = new Scanner(System.in);
        int money = 0;
        while (true) {
            System.out.println("请输入一个金额：");
            money = sc.nextInt(); // 2135
            // 判断该金额是否在有效区间
            if (money >= 0 && money <= 999999999) {
                break;
            }else {
                System.out.println("金额非法"); // 则需要重新输入一个金额知道有效为止.
            }
        }
        // 定义一个变量来表示money的大写
        String chineseMoney = ""; // 用来拼接
        int num = 0;
        while (true) {
            num = money % 10; // 5 3 1 2
            // 返回方法的调用处，并把转换后的结果返回给调用处
            String s = numberToChinese(num);

            chineseMoney = s + chineseMoney; // 调换位置非常地重要！ 相当于逆序了结果

            money /= 10; // 去掉个位数，把剩下的值重新赋给money  213 21 2 0
            if (money == 0) {
                break; // 跳出循环
            }
        }
        // System.out.println(chineseMoney);

        // 3. 在前面补0，补齐7位
        int count = 7 - chineseMoney.length(); // 7 - 4 = 3

        // 在前面补3个0，用for循环执行3次
        for (int i = 0; i < count; i++) {
            chineseMoney = "零" + chineseMoney;
        }
         /*System.out.println(chineseMoney);*/

        // 4. 插入单位  --同样用查表法的思想
        String[] units = {"佰", "拾", "万", "仟", "佰", "拾", "元"};
        //                 零    零    零    贰    壹    叁    伍

        String result = "";
        // 遍历数组chineseMoney
        for (int i = 0; i < chineseMoney.length(); i++) {
            char c = chineseMoney.charAt(i);
            // 拼接
            result = result + c + units[i];
            /*System.out.print(c);
            // 打印每一个字符的同时打印它对应的单位
            System.out. print(units[i]);*/
        }
        System.out.println(result);
    }
    // 2. 定义一个方法，用来将阿拉伯数字转换为大写中文数字
    public static String numberToChinese(int num) {
        // 3. 创建一个数组，用来存放0-9的大写中文
        String[] chinese = {"零","壹","贰","叁","肆","伍","陆","柒","捌","玖"}; // 查表法 ：表 --> 索引

        return chinese[num]; // 当数字和中文数字一一对应时，可以使用数组的索引进行转换
    }
}
