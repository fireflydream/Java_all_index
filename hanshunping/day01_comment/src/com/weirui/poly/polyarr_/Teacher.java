package com.weirui.poly.polyarr_;

public class Teacher extends Person{ // 报错原因：父类Person有构造器，而子类还没生成构造器对父类的构造器进行初始化
    // 若它没有明说属性的访问修饰符，则我们一般认为它是私有
    private double salary;
    // 一旦子类生成构造器，完成对父类构造器的初始化后，编译器便不再报错
    public Teacher(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    // 重写父类里面的say方法
    public String say() {
        return super.say() + "  " + "salary = " + this.salary;
    }
    // 特有方法
    public void teach() {
        System.out.println("老师 " + super.getName() + "在授课");
    }
}
