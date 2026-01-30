package com.weirui.poly.polytwo;

public class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }
    //
    public void eat() {
        System.out.println(super.getName() +
                "吃老鼠222");
    }
}
