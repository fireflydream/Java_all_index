package string;

public class StringDemo9 {
    public static void main(String[] args) {
        // 1. 获取一个手机号码
        String phoneNumber = "19353448662";

        // 2. 截取手机号码
        // 先截前三位
        String s1 = phoneNumber.substring(0, 3);

        // 再截后四位
        String s2 = phoneNumber.substring(7); // 从第7位开始截取直到最后一位

        // 3. 拼接
        String newPhoneNumber = s1 + "****" + s2;

        // 打印
        System.out.println(newPhoneNumber);
    }
}
