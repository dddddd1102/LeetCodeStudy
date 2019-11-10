package com.dd.ss;

import java.util.HashMap;

public class  LengthOfLongestSubstring {

    public static void main(String args[]) {
        System.out.println("Test: " + lengthOfLongestSubstring2("pwwkewp"));
    }

    static int lengthOfLongestSubstring(String s) {
        if(s == null || s.length() == 0) return 0;
        int max = 0;
        int left = 0;
        int right = 0;
        boolean[] used = new boolean[128]; // ASCII码值一共128
        while(right < s.length()) {
            if(!used[s.charAt(right)]) {
                // 如果right值未被使用则标记为true，并++
                used[s.charAt(right)] = true;
                right++;
            } else {
                max = Math.max(max, right -left); // 如果right值已经被使用，则判断最大值
                while(left < right && s.charAt(left) != s.charAt(right)) {
                    // 如果left小于right，且值不相等，则将left移一位，并标记为false
                    used[s.charAt(left)] = false;
                    left++;
                }
                left ++;
                right++;
            }
        }
        max = Math.max(max, right - left);
        return  max;
    }


    static int lengthOfLongestSubstring2(String s) {
        if(s == null || s.length() == 0) return 0;
        int pointer = 0;
        int index = 0;
        int max = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        while(index < s.length()) {
            char val = s.charAt(index);
            if(!map.containsKey(val)) {
                map.put(val, index);
            } else {
                pointer = Math.max(pointer, map.get(val) + 1);
                map.put(val, index);
            }
            max = Math.max(max, index - pointer + 1);
            index++;
        }
        return max;
     }

}