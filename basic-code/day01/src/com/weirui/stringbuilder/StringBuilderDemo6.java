package com.weirui.stringbuilder;

import java.util.StringJoiner;

public class StringBuilderDemo6 {
    public static void main(String[] args) {
        // 1. 创建一个StringJoiner对象  ： StringJoinder("间隔符", "开始符号", "结束符号");
        StringJoiner sj;
        sj = new StringJoiner(", ", "[", "]");

        // 2. 添加元素
        sj.add("1").add("2").add("3");

        System.out.println(sj);
    }
}
