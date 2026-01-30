package com.weirui.kebiancanshu;

public class VarParameter {
    public static void main(String[] args) {
        HspMethod h = new HspMethod();
        int res = h.add(12, 45, 55, 312);
        System.out.println(res);
    }
}
// 定义一个类：HspMethod
class HspMethod {
    // 方法重载
    public int add(int m, int n) {
        return m + n;
    }
    public int add(int m, int n, int p) {
        return m + n + p;
    }
    public int add(int m, int n, int p, int q) {
        return m + n + p + q;
    }
    // 可变参数
    public int add(int... pars) {
        // 1. int... pars : 可变参数 数据类型为int 即表示 可接收多个int（0 --> 多）
        // 2. 使用可变参数时，可以当做数组来使用 即  nums 可以当做数组
        // 3. 遍历数组求和即可
        //System.out.println("接收的参数个数：" + pars.length);
        int res = 0;
        for (int i = 0; i < pars.length; i++) {
            res += pars[i];
        }
        return res; //
    }
}