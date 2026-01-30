package com.weirui.demo;

public class Test02 {
    public static void main(String[] args) {
        // 生成一个4位数的随机验证码
        String code = getCode(4);
        System.out.println(code);
    }
    public static String getCode(int n) {
        // 定义一个字符串变量，用于保存生成的验证码
        String code = "";
        for (int i = 0; i < n; i++) {
            // i = 0　1　2　3
            // 随机生成一个 数字0 或者 大写字母1 或 小写字母2
            int type = (int) (Math.random() * 3);// [0, 1) * 3 --> [0, 3)
            // 使用switch判断当前位置随机的字符类型
            switch (type) {
                case 0:
                    // 随机生成一个数字
                    int num = (int) (Math.random() * 10);
                    code += num;
                    break;

                case 1:
                    // 随机生成一个大写字母
                    char ch = (char) (Math.random() * 26 + 'A');
                    code += ch;
                    break;

                case 2:
                    // 随机生成一个小写字母
                    char ch2 = (char) (Math.random() * 26 + 'a');
                    code += ch2;
                    break;
            }
        }
        return code;
    }
}
