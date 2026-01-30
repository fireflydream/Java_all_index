package string;

public class StringDemo7 {
    public static void main(String[] args) {
        String str  = new String("abc");
        // 将方法的结果返回到调用处
        String result = reverse(str);
        System.out.println(result);
    }
    // 1. 定义一个方法，实现字符串的反转
    public static String reverse(String str) {
        // abc --> cba
        // 从长度-1开始到0，逆着遍历  -- str.length.forr
        String result = ""; // 提前用来和字符串中的元素进行拼接
        for (int i = str.length() - 1; i >= 0; i--) { // 批量修改 ：相同的内容一次修改 --> shift + F6
            char c = str.charAt(i);
            result += c; // 将字符串中的每一个元素都和result进行拼接
        }
        return result;
    }
}
