package com.weirui.poly.polytwo;

public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //
    private void eat() {
        System.out.println(this.name + "吃老鼠111");
    }
    public void info() {
        eat();
    }
}
