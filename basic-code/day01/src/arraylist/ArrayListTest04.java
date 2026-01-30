package arraylist;

import com.weirui.student.Student;

import java.util.ArrayList;

public class ArrayListTest04 {
    public static void main(String[] args) {
        // 创建一个student类的集合，存储3个Student对象，并遍历
        ArrayList<Student> list = new ArrayList<>(); // 要同时创建一个javabean 对象

        // 2. 创建一个学生对象  --这种方式其实就写死了  键盘录入的话可以灵活的录入
        Student s1 = new Student("刘浩存", 25);
        Student s2 = new Student("刘亦菲", 25);

/*        s1.setName("刘浩存");
        s1.setAge(25);

        s1.getName();
        s1.getAge();

        System.out.println(s1.getName());
        System.out.println(s1.getAge());*/

        // 3. 添加到集合中
        list.add(s1);
        list.add(s2);

        // 4. 遍历集合
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);// 获取集合中的对象
            // 由于这个student类是我们自己写的javabean类，而不是java本身写好的类，因此我们在打印这个对象时，要调用该对象的相应方法.
            System.out.println(stu.getName() + " " + stu.getAge());
        }

    }
}
