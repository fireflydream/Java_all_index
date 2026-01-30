package string;

public class StringDemo11 {
    public static void main(String[] args) {
        // 敏感词替换 ： string里面的replace方法

        // 1. 创建一个字符串并初始化
        String s = new String("你他娘的还真有出息啊！傻叉");

        // 2. 替换敏感词
        String talk = s.replace("他娘的", "***");

        // 3. 定义一个敏感词库 ：当一句话中出现多个敏感词时，依次被***替换
        String[] words = {"他娘的", "tmd", "傻逼", "傻叉"};

        for (int i = 0; i < words.length; i++) {
            s = s.replace(words[i], "***");
        }
        System.out.println(s);

        
    }
}
