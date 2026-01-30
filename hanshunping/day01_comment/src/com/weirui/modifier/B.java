package com.weirui.modifier;

public class B {
    // 属性

    public void b() {
        // 实例化一个A对象 [方法里面才能实例化一个对象]
        A a = new A();
        // 在同一个包下，可以访问 public、protected、默认 ；
        // 不能访问private
        System.out.println(a.name + a.age + a.gender );
    }

}
