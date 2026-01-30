package com.weirui.stringbuilder;

public class StringBuilderDemo2 {
    public static void main(String[] args) {
        // toString() : 它可以将StringBuilder里面的内容转换为String

        // 1. 创建一个StringBuilder对象
        StringBuilder sb = new StringBuilder();

        // 2. 添加数据
        // 链式编程： 当我们在调用一个方法时，可以通过这个方法再去调用其他方法.  --常用的方式
        sb.append("abc").append("def").append("ghi");

        /*sb.append("abc");
        sb.append("def");
        sb.append("ghi");
        sb.append("gkl");*/

        // 3. 转换为String
        String str = sb.toString();


        System.out.println(str);

    }
}
