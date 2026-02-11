package com.weirui.hashcode;

public class HashCode01 {
    public static void main(String[] args) {
        // 实例化两个对象，这两个对象的引用不是指向同一个对象
        O o1 = new O();
        O o2 = new O();
        O o3 = o1;
        System.out.println("o1.hashCode() = " + o1.hashCode());
        System.out.println("o3.hashCode() = " + o3.hashCode());

        // 两个引用，若指向的是不同对象，则哈希值是不一样的
//        System.out.println("o1.hashCode() = " + o1.hashCode());
//        System.out.println("o2.hashCode() = " + o2.hashCode());

    }
}
