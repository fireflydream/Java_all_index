package com.weirui.user;

public class User {
    // 属性
    private String userName;
    private String password;
    private String email;
    private char gender;
    private int age;

    // 生成2个构造方法和set、get方法 的快捷键：alt + insert
    // 更高效的生成方式： 插件PTG ==> 一秒生成标准的javabean

    // javabean 类：至少要有2个构造方法： 无参构造 和 有参构造
    // 无参构造
    public User() {

    }
    // 有参构造
    public User(String userName, String password, String email, char gender, int age) {
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.gender = gender;
        this.age = age;
    }

    //set和get方法
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getUserName() {
        return userName;
    }
    public String getPassword() {
        return password;
    }
    public String getEmail() {
        return email;
    }
    public char getGender() {
        return gender;
    }
    public int getAge() {
        return age;
    }

    // 行为
}
