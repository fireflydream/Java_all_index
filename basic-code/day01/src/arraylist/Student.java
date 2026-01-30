package arraylist;

public class Student {
    // 1. 私有化的成员变量
    // 2. 空参构造
    // 3. 带参构造
    // 4. getter和setter方法

    // 快捷键： fn + alt + insert
    // 1. 私有化的成员变量
    private String name;
    private int age;

    // 2. 空参构造
    public Student() {
    }
    // 3. 带参构造
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // 4. getter和setter方法

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
