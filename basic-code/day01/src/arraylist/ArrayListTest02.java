package arraylist;

import java.util.ArrayList;

public class ArrayListTest02 {
    public static void main(String[] args) {
        // 创建一个集合对象
        ArrayList list = new ArrayList();

        // 添加数据
        list.add("2025年");
        list.add("7月");
        list.add("30号");

        // 遍历集合
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                System.out.print(list.get(i) + "]");
            }else {
                System.out.print(list.get(i) + ",");
            }
        }
    }

















    /*public static void main1(String[] args) {
        // 1. 创建一个ArrayList对象
        ArrayList<Integer> list = new ArrayList<>();

        // 2. 添加数据
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // 3. 遍历集合
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                System.out.print(list.get(i) + "]");
            }else {
                System.out.print(list.get(i) + ", ");
            }
        }
    }*/
}
