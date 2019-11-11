package com.dd.ss;

public class RomanToInt {

    public static void main(String[] args) {

    }

    static int romanToInt(String s) {
        if(s == null || s.length() == 0) return 0;
        int result = 0;
        if(s.indexOf("IV") != -1 || s.indexOf("IX") != -1) result -= 2;
        if(s.indexOf("XL") != -1 || s.indexOf("XC") != -1) result -= 20;
        if(s.indexOf("CD") != -1 || s.indexOf("CM") != -1) result -= 200;
        for(char c: s.toCharArray()) {
            if(c == 'I') result += 1;
            else if(c == 'V') result += 5;
            else if(c == 'X') result += 10;
            else if(c == 'L') result += 50;
            else if(c == 'C') result += 100;
            else if(c == 'D') result += 500;
            else if(c == 'M') result += 1000;
        }
        return result;
    }

}