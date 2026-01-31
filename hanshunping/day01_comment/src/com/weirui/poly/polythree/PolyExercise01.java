package com.weirui.poly.polythree;

public class PolyExercise01 {
    public static void main(String[] args) {
        double d = 13.4;
        long l = (int) d; // 把double类型转换为long类型，必须要强转。因为这是两套逻辑
        System.out.println(l);
        int in = 5;
        // boolean b = (boolean) in; // 错误，原因：int --> boolean
        Object object = "hello"; // 向上转型
        String objStr = (String) object; // 向下转型
        System.out.println(objStr);

        Object objPri = new Integer(5);
        // 编译器没有报错的原因：objPri是一个Object类型，有可能指向String类型；
        // 但实际上，objPri指向的是Integer类型。这两种类型没有继承关系，所以运行时会抛出异常
        String str = (String) objPri; // 错误！

        Integer str1 = (Integer) objPri; // 向下转型

    }
}
