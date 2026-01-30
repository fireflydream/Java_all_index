package string;

public class StringDemo6 {
    public static void main(String[] args) {
        /*int[] arr = new int[0]; // 数组长度为0 这种数组没有实际的意义*/
        int[] arr = {1,2,3,4,5};

        String result = arrToString(arr);
        System.out.println(result);
    }
    // 定义一个拼接方法，用来将数组中的元素拼接成字符串
    public static String arrToString(int[] arr) {
        if (arr == null) {
            return ""; // 返回一个双引号，表示该数组为空  --返回一个长度为0的数组
        }
        if (arr.length == 0) {
            return "[]"; // 返回一个方括号，表示该数组的长度为0  --返回一个长度为0的数组
        }
        // 该数组是一个有意义的数组 ：数组里面时有内容的.
        // 遍历数组
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i] + "]");
            }else {
                System.out.print(arr[i] + ",");
            }
        }
        return ""; // 返回一个空字符串，用于字符串最后的拼接  其实也是为了让代码不报错. --返回一个长度为0的数组
    }
}
