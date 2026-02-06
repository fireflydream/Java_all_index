package com.weirui.poly.polyarr_;

public class PolyArray {
    public static void main(String[] args) {
        /*
        * 应用实例：现有一个继承结构如下：要求创建一个Person对象
        *         2个Student对象、2个Teacher对象，统一放在多态数组中，并调用每一个对象say方法
        * */
        // 创建一个动态的一维数组persons
        Person[] persons = new Person[5];
        persons[0] = new Person("刘浩存", 25);
        persons[1] = new Student("李超", 23, 100);
        persons[2] = new Student("linus", 47, 99);
        persons[3] = new Teacher("姜维", 23, 20000);
        persons[4] = new Teacher("诸葛亮", 44, 30000);

        // 循环遍历多态数组，调用say方法
        for (int i = 0; i < persons.length; i++) {
            // persons[i].say() 相当于 对象名.方法名 ;因此，这里有一个java的动态绑定机制
            System.out.println(persons[i].say()); // 这个对象的编译类型不变，但它的运行类型会随着数组元素不同而不同
            // 父类想要访问子类Student、Teacher的方法，则它需要向下转型
            if (persons[i] instanceof Student) { // 判断数组元素（这个对象）的运行类型是不是Student类
                // 运行类型是Student类，则向下转型
                Student stu = (Student) persons[i];
                stu.study();
            } else if (persons[i] instanceof Teacher) {
                /*Teacher teacher = (Teacher) persons[i];
                teacher.teach();*/
                ((Teacher) persons[i]).teach();
            }else if (persons[i] instanceof Person) {
                // 不做任何处理
            }else {
                System.out.println("你的类型有误，请自行检查");
            }
        }
    }
}
