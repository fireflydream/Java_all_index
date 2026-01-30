package string;

import com.sun.org.apache.xpath.internal.operations.Equals;

public class StringDemo1 {
    public static void main(String[] args) {
        // 创建2个字符串对象
        String s1 = new String("abc");
        String s2 = "Abc"; // 直接赋值 ：创建字符串对象

        //2. == 比较
        // 基本数据类型：数据值
        // 引用数据类型：地址值 （如：string）

        // 3.比较字符串的内容是否一致
        // 区分大小写： equals
        // 不区分大小写（如：验证码）：equalsIgnoreCase
        boolean result = s1.equals(s2);
        System.out.println(result); // false

        boolean result2 = s1.equalsIgnoreCase(s2);
        System.out.println(result2); // true
    }
}
