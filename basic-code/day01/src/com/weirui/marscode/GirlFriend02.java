package com.weirui.marscode;

public class GirlFriend02 {
    //成员属性
   private String name;
   private int age;
   private double height;
   private char gender;

   public void setName(String name) {
       this.name = name;
   }
   public void setAge(int age) {
       this.age  = age;
   }
   public void setHeight(double height) {
       this.height  = height;
   }
   public void setGender(char gender) {
       this.gender  = gender;
   }

   public String getName() {
       return name;
   }
   public int getAge() {
       return age;
   }
   public double getHeight() {
       return height;
   }
   public char getGender() {
       return gender;
   }

    //成员方法
    public void sleep() {
        System.out.println(name + "正在睡觉");
    }
    public void eat() {
        System.out.println(name + "正在吃东西");
    }
    public void coquetry() {
        System.out.println(name + "爱撒娇");
    }
}
