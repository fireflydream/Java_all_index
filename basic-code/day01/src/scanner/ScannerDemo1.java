package scanner;
//类名冲突（该类名和scanner类名）时，编译器不会自动导包.
import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {
        // 创建一个scanner对象，用来接收一个小数
        Scanner sc = new Scanner(System.in);
        // 请输入一个小数
        System.out.println("请输入一个小数：");
        //接收一个小数
        double num = sc.nextDouble(); // ctrl+alt+v : 自动生成左值

        // 输出
        System.out.println(num);
    }
}
