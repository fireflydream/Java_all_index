package com.weirui.poly;

public class Test {
    public static void main(String[] args) {
        // 体验对象多态的特点

        Dog dog = new Dog("大黄");
        Bone bone = new Bone("猪骨头");

        Master master = new Master("李超");
        master.feed(dog, bone);

        System.out.println("================");

        Cat cat = new Cat("小花猫");
        Fish fish = new Fish("小黄鱼");

        master.feed(cat, fish);

        System.out.println("================");

        Pig pig = new Pig("小粉猪");
        Rice rice = new Rice("大米饭");

        master.feed(pig, rice);
    }
}
