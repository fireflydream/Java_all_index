package com.lichao.two;

import com.lichao.one.A;

public class B extends A {
    //private String school = "张家界学院";

    public B(char gender, String name, int age, String cls) {
        super(gender, name, age, cls);
    }

    public B(String school) {
        this.school = school;
    }

    public void info() {
        System.out.println(this.school);
    }
}
