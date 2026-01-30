package com.weirui.exersize;

public class Exersize21 {

}
// 1. 定义一个日期类
class Date {
    // 成员变量 -- 属性
    public int year;
    public int month;
    public int day;

    // 行为
//    往方法中传入形参时，既需要形参名，又需要形参的数据类型
    public void setDay(Date this, int year, int month, int day) {  // 方法内的变量（包括形参），也被称为局部变量。
        // 局部变量的优先级 > 成员变量
        this.year = year;  // this代表当前对象的引用 即 "谁调用了setDay()，this表示的就是这个对象"
        this.month = month;
        this.day = day;
    }

    /*
    *  main方法可以在任何类中进行声明
    * */
    public static void main(String[] args) {
//        setDay(2026, 1, 17);  // main()不能直接调用其他方法，需要通过实例化一个对象的方式来调用

//        实例化一个Date对象
        Date date = new Date();
        date.setDay(2026, 1, 17);

        // 调用printDate()
        date.printDate();
    }
    public void setTime() {
        setDay(2026, 1, 17);
    }
    public void printDate() {
        System.out.println(this.year + "年" + this.month + "月" +
                this.day + "日");
    }
}
