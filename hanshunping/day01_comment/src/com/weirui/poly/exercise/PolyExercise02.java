package com.weirui.poly.exercise;

public class PolyExercise02 {
    public static void main(String[] args) {
        // 实例化两个Person对象
        Person person1 = new Person("jack", 20, '男');
        Person person2 = new Person("jack", 20, '男');

        // 重写equals方法，判断上面两个对象是否是同一个对象
        System.out.println(person1.equals(person2)); // true
    }
}
