package com.dd.ss;

import java.util.HashMap;
import java.util.Map;

/**
 * 两数之和<br>
 * 给定一个整数数组 nums 和一个目标值 target，在该数组中找出和为目标数的两个整数，并返回他们的数组下标
 * 
 */
public class TwoSum {

    public static void main(String[] args) {



    }

    /**
     * 时间复杂度O(n2), 空间复杂度O(1)
     */
    static int[] twoSum1(int nums[], int target) {
        int result[] = new int[2];
        int len = nums.length;
        for(int i = 0; i < len; i++) {
            int value = nums[i];
            for(int j = i + 1; j < len; j++) {
                if(value + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }


    /**
     * 时间复杂度O(n)，空间复杂度O(n)
     */
    static int[] twoSum2(int nums[], int target) {
        int result[] = new int[2];
        if(nums == null || nums.length <= 0) {
            return result;
        }
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++) {
            int val = nums[i];
            int aux = target - val;
            if(map.containsKey(aux)) {
                result[0] = i;
                result[1] = map.get(aux);
                return result;
            } else {
                map.put(val, i);
            }
        }
        return result;
    }

}