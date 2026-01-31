package com.weirui.poly.polythree;

public class PolyDetail01 {
    public static void main(String[] args) {
        // 对象的多态 -- 向上转型
        // 子类的对象可以访问父类中的所有成员
        // 没有属性重写之说，属性的值看的是编译类型的值
        Base s = new Sub();
        // count属性的值看的是访问对象编译类型的值 <==> 向上转型 （子类的对象可以访问父类中的所有成员）
        System.out.println(s.count); // 10

        Sub sub = new Sub();
        System.out.println(sub.count); // 20
    }
}
// 父类
class Base {
    int count = 10;
}
// 子类
class Sub extends Base {
    int count = 20;
}
