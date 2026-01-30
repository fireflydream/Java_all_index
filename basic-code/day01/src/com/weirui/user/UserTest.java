package com.weirui.user;

public class UserTest {
    public static void main(String[] args) {
        // 创建一个 User 对象并赋值
        User u = new User("葳蕤", "123456", "weirui@163.com", '男', 22);

        // 打印结果
        System.out.println(u.getUserName());
        System.out.println(u.getPassword());
        System.out.println(u.getEmail());
        System.out.println(u.getGender());
        System.out.println(u.getAge());
    }
}
