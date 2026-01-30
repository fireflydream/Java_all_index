package arraylist;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        // 1. 创建一个集合对象(String)

        /*// jdk8 before:
        ArrayList<String> list = new ArrayList<String>();*/

        // jdk8:
        ArrayList<String> list = new ArrayList<>();

        // 2. 添加元素
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");

        // System.out.println(list);

        // 3. 删除元素
       /* boolean d1 = list.remove("aaa");*/

        /*System.out.println(d1);

        System.out.println(list);*/

        /*String d2 = list.remove(0); */// 把索引为0的元素删除，并返回

        /*System.out.println(d2);

        System.out.println(list);*/


        /*String d3 = list.set(1, "ccc");*/ // 把索引为1的元素替换成ccc，并返回

        /*System.out.println(d3);

        System.out.println(list);*/

        // 4. 查询元素
        /*String select = list.get(0);*/
        /*System.out.println(select);*/

        // 5. 遍历集合  
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            System.out.println(str);
        }

    }
}
