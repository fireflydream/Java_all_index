package string;

public class StringDemo10 {
    public static void main(String[] args) {
        // 1. 创建一个字符串变量，用来记录身份证号码
        String id = "430482200210249553";
        
        // 2. 截取身份证的第7-10位
        String year = id.substring(6, 10);

        // 3. 截取身份证的第11-12位
        String month = id.substring(10,12);

        // 4. 截取身份证的第13-14位
        String day = id.substring(12, 14);

        // 5. 获取性别 -- 倒数第二位
        char gender = id.charAt(16);


        // 6. 拼接
        System.out.println("人物信息：");
        System.out.println("出生年月：" + year + "年" + month + "月" + day + "日");

        System.out.println("性别：" + (gender % 2 == 0  ? "女" : "男") );
        /*if (gender % 2 == 0) {
            System.out.println("性别：女");
        }else {
            System.out.println("性别：男");
        }*/

    }
}
