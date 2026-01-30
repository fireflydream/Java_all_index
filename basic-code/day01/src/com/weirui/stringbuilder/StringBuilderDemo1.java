package com.weirui.stringbuilder;

public class StringBuilderDemo1 {
    public static void main(String[] args) {
        // 1. 创建一个StringBuilder对象
        StringBuilder sb = new StringBuilder("abc");

        // 2. 添加数据: append()
       /* sb.append(1);
        sb.append(2.3);
        sb.append(true);*/

        // 3. 反转 ：reverse()
         sb.reverse();

        // 4. 获取长度
        int len = sb.length();
        System.out.println(len);

        System.out.println(sb);
    }
}
