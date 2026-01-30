package com.weirui.encapsulation;

public class AccountTest {
    public static void main(String[] args) {
        // 实例化一个Account对象
        Account account = new Account();
        account.setName("王五");
        account.setBalance(18);
        account.setPsw("1234567");
        System.out.println(account.info());
    }
}
