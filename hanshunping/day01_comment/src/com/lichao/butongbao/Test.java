package com.lichao.butongbao;

import com.weirui.modifier.A;

public class Test {
    public static void main(String[] args) {
        A a = new A();
        // 在不同的包下，只可以访问 public 修饰的属性和方法
        System.out.println("姓名：" + a.name) ;
    }
}
