package arraylist;

import java.util.ArrayList;

public class ArrayListTest03 {
    public static void main(String[] args) {
        // 创建一个集合对象，集合中存储字符 --如果是集合存储基本数据类型，那么集合要使用对应的包装类
        ArrayList<Character> list = new ArrayList<>();

        // 添加字符
        list.add('a');
        list.add('b');
        list.add('c');

        // 遍历集合
        System.out.println("[");
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) { // i是集合的最后一个下标
                System.out.println(list.get(i) + "]");
            }
            Character c = list.get(i);
            System.out.print(c + " ");
        }

    }
}
