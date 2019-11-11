package com.dd.ss;

public class LongestPalindrome {

    public static void main(String[] args) {
        System.out.println("Test: " + longestPalindrome("ccc"));
    }

    static String longestPalindrome(String s) {
        if(s == null || s.length() == 0) return "";
        int len = s.length();
        boolean isPalindrome[][] = new boolean[len][len];
        int start = 0;
        int length = 1;
        for(int i = 0; i < len; i++) { // 单个字符一定是回文串
            isPalindrome[i][i] = true;
        }
        for(int i = 0; i < len - 1; i++) { // 两个字符相等时为回文串
            if(s.charAt(i) == s.charAt(i + 1)) {
                isPalindrome[i][i + 1] = true;
                start = i;
                length = 2;
            }
        }
        for(int i = 3; i <= len; i++) { // i 表示当前判断字符串的长度
            // 三个以上字符，只要首位相等，且中间为回文串，既整体也为回文串
            for(int j = 0; j + i - 1 < len; j++) {
                if(s.charAt(j) == s.charAt(j + i - 1) && isPalindrome[j+1][j + i - 2]) {
                    isPalindrome[j][j + i - 1] = true;
                    start = j;
                    length = i;
                }
            }
        }

        return s.substring(start, start + length);
    }

}