package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest05 {
    public static void main(String[] args) {
        // 创建一个集合对象  --集合初始的长度为0
        ArrayList<Student> list = new ArrayList<>();

        // 键盘录入3个学生信息并添加到集合中
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            // 创建学生对象
            Student s = new Student();  // 必须在循环内创建.  若在循环外创建，其实只是创建一个对象，每次for循环的调用，都是同一个对象在修改数据，直至保留最后一组数组.
            System.out.println("请输入学生的姓名：");
            String name = sc.next();
            System.out.println("请输入学生的年龄：");
            int age = sc.nextInt();
            // 将输入的值赋给学生对象，-- set() 目的是建立它们和学生对象之间的联系
            s.setName(name);
            s.setAge(age);

            // 将学生对象添加到集合中
            list.add(s);
        }

        // 遍历集合
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getName() + " " + stu.getAge());
        }
    }
}
