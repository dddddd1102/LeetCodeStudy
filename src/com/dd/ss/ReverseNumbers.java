package com.dd.ss;

public class ReverseNumbers {

    public static void main(String args[]) {

        System.out.println("Test: " + reverse(2147483647));

    }

    public static int reverse(int x) {
        int rev = 0;
        while(x != 0) {
            int newRev = rev * 10 + x % 10;
            if((newRev - x % 10) / 10 != rev) return 0; // 检查是否overflow，进行逆操作.
            rev = newRev;
            x /= 10;
        }
        return rev;
    }
}