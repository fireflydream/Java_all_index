package com.lichao.one;

public class A {
    public char gender;
    String name;
    private int age;
    protected String cls;
    public String school = "吉首大学";

    public A(String school) {
        this.school = school;
    }

    public A() {
    }

    public A(char gender, String name, int age, String cls) {
        this.gender = gender;
        this.name = name;
        this.age = age;
        this.cls = cls;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    //


    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCls() {
        return cls;
    }

    public void setCls(String cls) {
        this.cls = cls;
    }
}
