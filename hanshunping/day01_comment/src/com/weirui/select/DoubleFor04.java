package com.weirui.select;

public class DoubleFor04 {
    public static void main(String[] args) {
        /*
        * 用for循环打印金字塔
        * */
        //--> 打印半个金字塔
/*      *                第一层 ： 1个星星
        **               第二层： 2个星星
        ***              第三层： 3个星星
        ****             第四层： 4个星星
        *****            第五层 ：5个星星
                 ---> 用 i表示层数 j表示星星                            */

        //1. 用i来表示行数，j来表示列数
//        for (int i = 1; i <= 5; i++) {
//            // 每列表示*的个数
//            for (int j = 1; j <= i; j++) {
//                System.out.print('*'); // 每一列的星星都在一行，因此不需要换行
//            }
//            System.out.println();
//        }

        //2.打印整个金字塔
//         *         第一层： 1个星星  4个空格 （总空格 - 该层层数） ---> 用k来表示空格 k = 5 - i
//        ***        第二层： 3个星星  3个空格
//       *****       第三层： 5个星星  2个空格
//      *******      第四层： 7个星星  1个空格
//     *********     第五层： 9个星星  0个空格
//         ---> i : 层数 ， 2i - 1 : 星星数
//        for (int i = 1; i <= 5; i++) {
//            // 3.打印前置空格
//            for (int k = 1; k <= 5 - i ; k++) {
//                System.out.print(" ");
//            }
//            // 2.打印每行的星星
//            for (int j = 1; j <= 2 * i - 1; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        // 3. 空金字塔
//         *         第一层： 1个星星  当前行的第一个位置是*，最后一个位置*
//        * *        第二层： 2个星星  当前行的第一个位置是*，最后一个位置*
//       *   *       第三层： 2个星星  当前行的第一个位置是*，最后一个位置*
//      *     *      第四层： 2个星星  当前行的第一个位置是*，最后一个位置*
//     *********     第五层： 9个星星  全部输出*

        // 先死后活
        int totalLevel = 5; // 层数
        for (int i = 1; i <=totalLevel ; i++) {
            // 3.定义一个变量i，用来表示空格数
            for (int k = 0; k < totalLevel - i; k++) {
                System.out.print(" ");
            }
            //2. 定义一个变量j，用来表示星星数
            for (int j = 1; j <= 2 * i - 1; j++) {
                // 4.当前行的第一个位置是*，最后一个位置是* ；最后一行全部输出*
                if (j == 1 || j == 2 * i - 1 || i == totalLevel) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
