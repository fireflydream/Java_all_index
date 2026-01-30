package com.weirui.select;

import java.util.Scanner;

public class DoWhile03 {
    public static void main(String[] args) {
        int i = 0;
        char answer = ' ';
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("张三，还钱嘛？ y/n");
            answer = sc.next().charAt(0);
            switch (answer) {
                case 'y':
                    System.out.println("老韩就不抽你了");
                    break;
                case 'n':
                    System.out.println("张三，你TM找死是吧？？！");
                    break;
            }
            i++;
        }while (answer != 'y');
    }
}
