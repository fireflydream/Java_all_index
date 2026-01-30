package com.weirui.stringbuilder;

import java.util.StringJoiner;

public class StringBuilderDemo5 {
    public static void main(String[] args) {
        // 1. 创建一个StringJoiner对象  --带参   "间隔符"
        StringJoiner sj = new StringJoiner("---");
        
        // 2. 添加数据
        sj.add("aaa").add("bbb").add("ccc");

        System.out.println(sj);
    }
}
