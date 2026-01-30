package com.weirui.poly;

public class Master {
    private String name;

    public Master(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // 对象的多态机制
    // 对象animal 的编译类型是Animal，该对象可以指向（接收）运行类型（子类）的对象
    public void feed(Animal animal, Food food) { // 父类的引用可以指向它的子类
        System.out.println("主人" + this.name + "给" +
                animal.getName() + "喂" + food.getName());
    }

   /* // 主人给小狗喂骨头
    public void feed(Dog dog, Bone bone) {
        System.out.println("主人" + this.name + "给" + dog.getName() + "喂" + bone.getName());
    }

    // 主人给小猫喂鱼
    public void feed(Cat cat, Fish fish) {
        System.out.println("主人" + this.name + "给" + cat.getName() + "喂" + fish.getName());
    }*/

}
