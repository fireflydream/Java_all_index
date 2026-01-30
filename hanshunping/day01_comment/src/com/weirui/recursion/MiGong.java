package com.weirui.recursion;

public class MiGong {
    public static void main(String[] args) {
        // 思路：
        // 1. 创建一个迷宫，用二维数组来表示 int[][] map = new int[8][7];
        // 2. 先规定数组的元素值：0 表示可以走 1表示障碍物
        //
        int[][] map = new int[8][7];
        for (int i = 0; i < map.length; i++) {
            map[i][0] = 1;
            map[i][(map.length - 1) - 1] = 1; // map.length == 8
            for (int j = 0; j < map[i].length; j++) {
                map[0][j] = 1;
                map[map[i].length][j] = 1;
            }
        }
        map[3][1] = 1;
        map[3][2] = 1;

        H h = new H();
        h.findWay(map, 1, 1);
        // 输出当前地图
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }
}
// 定义一个H类
class H {
    // 属性

    // 行为

    // 1.findWay方法就是专门用来寻找迷宫的路径的
    // 2.如果找到，就返回一个true，否则就返回一个false
    // 3.row,col 表示老鼠当前的位置 即初始化位置
    // 4.map[6][5] 表示的是出口的位置  当map[6][5] = 2时，就说明找到通路了，就可以结束了
    // 5.规定：0 ：可以走； 1：有障碍物； 2：这条路走得通； 3：走过但走不通是死路
    // 6.先定义老鼠走路的策略：下 --> 右 --> 上 --> 左
    public boolean findWay(int[][] map, int row, int col) { // 找出迷宫路径的方法
        if (map[6][5] == 2) { // 找到了
            return true;
        }else { // 没找到，继续走
            if (map[row][col] == 0) { // 这个位置可以走
                map[row][col] = 2; // 把可以走得通的位置标记为2
                // 使用找路策略，来确定该位置是否真的可以走通
                // 下 --> 右 --> 上 --> 左
                if (findWay(map, row + 1, col)) {
                    return true;
                }else if (findWay(map, row, col + 1)) {
                    return true;
                }else if (findWay(map, row - 1, col)) {
                    return true;
                }else if (findWay(map, row, col - 1)) {
                    return true;
                }else {
                    map[row][col] = 3; // 这个位置上下左右都走不通，我们把它标记为3
                    return false;
                }
            }
        }
        // map[row][col] != 0 ,此时为死路，返回false
        return false;
    }
}
