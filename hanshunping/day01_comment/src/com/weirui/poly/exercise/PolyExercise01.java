package com.weirui.poly.exercise;

public class PolyExercise01 {
    public static void main(String[] args) {
        // 实例化一个子类Sub对象
        Sub s = new Sub();
        // 属性的值看的是 访问属性对象的编译类型 -Sub
        System.out.println(s.count); // 20
        s.display(); // 20

        Base b = s;
        System.out.println(b == s); // true
        System.out.println(b.count); // 10
        // 只要是方法的访问，就要看对象b的运行类型
        b.display(); // 20

    }
}
