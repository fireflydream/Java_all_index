package com.weirui.poly.objectpoly;

public class Test {
    public static void main(String[] args) {
        // 体验对象多态的特点

        // animal 编译类型 Animal  运行类型 Dog
        Animal animal = new Dog();
        // 因为运行时 执行到该行时，animal的运行类型：Dog.所以cry就是Dog的cry
        animal.cry(); // 方法就是运行类型的方法
    }
}
