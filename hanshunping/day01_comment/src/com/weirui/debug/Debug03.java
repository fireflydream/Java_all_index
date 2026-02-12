package com.weirui.debug;

import java.util.Arrays;

public class Debug03 {
    public static void main(String[] args) {
        int[] arr = {-20, -30, 10, 5, 3};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
