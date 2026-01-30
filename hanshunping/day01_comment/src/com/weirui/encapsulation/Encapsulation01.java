package com.weirui.encapsulation;

public class Encapsulation01 {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("张三");
        p.setAge(23);
        p.setSalary(20000);
        System.out.println(p.info());

        Person p2 = new Person("李四", 20000, 500000);
        System.out.println(p2.info());

    }
}
// 定义一个类：Person
class Person {
    // 属性
    String name;
    private int age;
    private double salary;

    // 构造器


    public Person() {
    }

    public Person(String name, int age, double salary) {
        /*this.name = name;
        this.age = age;
        this.salary = salary;*/

        setName(name);
        setAge(age);
        setSalary(salary);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        // 加入对数据的校验，相当于增加了业务逻辑
        if (name.length() >= 2 && name.length() <= 6) {
            this.name = name;
        }else {
            System.out.println("名字的长度非法，需要（2-6）个字符，默认名字");
            this.name = "无名人";
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) { // 对set方法里面的属性进行判断并赋值
        if (age >= 1 && age <= 120) {
            this.age = age;
        }else {
            System.out.println("请输入正确的年龄，年龄范围应在1-120之间。默认年龄为18");
            this.age = 18; // 若年龄不合理，则给一个默认年龄
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // 写一个方法来返回属性的值
    public String info() {
        return "姓名：" + name + " " + "年龄：" + age + " " + "薪水：" + salary;
    }
}