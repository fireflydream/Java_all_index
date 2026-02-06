package com.weirui.poly.dynamicbinding;

public class B extends A{
    // 私有属性
    public int i = 20;

//    public int sum() {
//        return i + 20;
//    }

    public int sum1() {
        return i + 10;
    }
    public int getI() {
        return i;
    }
}
