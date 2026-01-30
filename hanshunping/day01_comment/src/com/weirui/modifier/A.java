package com.weirui.modifier;

public class A {
    // 属性
    public String name = "李超"; // 就地初始化
    protected int age = 23;
    char gender = '男';
    private String cls = "软工一班"; // class：是关键字 不能用作变量名

    // 行为
    public void a() {
        // 在同类下；public、protected、无修饰符、private
        // 这四种修饰符均可使用
        System.out.println("姓名：" + name + "\t" + "年龄：" + age + "\t" +
                "性别：" + gender + "\t" + "班级：" + cls);
    }
    private void a2() {

    }
}

