package com.weirui.poly.polytwo;

public class Test {
    public static void main(String[] args) {
        // 对象多态的向上转型
        // 父类的引用指向子类的对象
        Animal animal = new Cat("小狸猫");
        animal.info();

        // 向下转型：父类强制转换为子类
        // 用于访问子类的所有成员
        Cat cat = (Cat) animal;
        cat.eat();

        // Dog dog = (Dog) animal;
    }
}
