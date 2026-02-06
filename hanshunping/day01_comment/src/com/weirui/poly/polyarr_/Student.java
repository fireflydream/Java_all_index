package com.weirui.poly.polyarr_;

public class Student extends Person{ // 报错原因：父类Person有构造器，而子类还没生成构造器对父类的构造器进行初始化
    // 若它没有明说属性的访问修饰符，则我们一般认为它是私有
    private double score;
// 一旦子类生成构造器，完成对父类构造器的初始化后，编译器便不再报错
    public Student(String name, int age, double score) {
        super(name, age);
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
    // 重写父类里面的say方法
    public String say() {
        return super.say() + "  " + "score = " + this.score;
    }
    // 特有方法
    public void study() {
        System.out.println("学生 " + super.getName() + "正在学习java课程");
    }
}
