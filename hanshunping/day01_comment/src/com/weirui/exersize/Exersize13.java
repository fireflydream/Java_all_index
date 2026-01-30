package com.weirui.exersize;

public class Exersize13 {
    public static void main(String[] args) {
        /*
        * 请遍历一个数组，并输出该数组中的各个元素
        * */

        int[][] map = {{0, 0, 1},{1, 1, 1},{1, 1, 3}};

//        实例化一个对象arr()，并赋值给类arr
        array arr = new array();
//        用类arr调用arrayList()
        arr.arrayList(map);

//        int[][] map = {{0, 0, 1},{1, 1, 1},{1, 1, 3}};
//
////        传统方法：
//        for (int i = 0; i < map.length; i++) {
//            for (int j = 0; j < map.length; j++) {
//                System.out.print(map[i][j] + " ");
//            }
//            System.out.println();
//        }

    }
}
// 定义一个数组类
class array {
//    属性

//    行为
    public void arrayList(int[][] map) {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }
}
