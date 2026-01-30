package com.weirui.encapsulation;

public class Account {
    // 属性
    private String name;
    private double balance; // 余额
    private String psw;
    // 行为


    public Account() {
    }

    public Account(String name, double balance, String psw) {
        setName(name);
        setBalance(balance);
        setPsw(psw);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 2 && name.length() <= 4) {
            this.name = name;
        }else {
            System.out.println("该姓名的字符长度非法，应为2-4之间，输出默认值");
            this.name = null;
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance > 20) {
            this.balance = balance;
        }else {
            System.out.println("余额小于20，显示默认值");
            this.balance = 0.0;
        }
    }

    public String getPsw() {
        return psw;
    }

    public void setPsw(String psw) {
        if (psw.length() == 6) {
            this.psw = psw;
        }else {
            System.out.println("您输入的密码长度错误，请重新输入");
            this.psw = null;
        }
    }
    // 写一个方法info，返回属性的值
    public String info() {
        return "姓名：" + name + " " + "余额：" + balance + " " + "密码：" + psw;
    }
}
