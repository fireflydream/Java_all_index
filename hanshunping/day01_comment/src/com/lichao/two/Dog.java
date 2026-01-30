package com.lichao.two;

public class Dog {
    public static void main(String[] args) {

        Dog dog = new Dog(); // 这个Dog()对象：是在包： com.lichao.two 下

        // 在另一个包下的对象，我们创建时需要在对象Dog()前 指定包名 com.lichao.one
        com.lichao.one.Dog dog2 = new com.lichao.one.Dog();
        System.out.println(dog2);
    }
}
