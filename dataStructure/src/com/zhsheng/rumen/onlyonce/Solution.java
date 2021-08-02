package com.zhsheng.rumen.onlyonce;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution {
    public static int singleNumber(int[] nums) {
        // 用set集合去重
        /*Set<Integer> set = new HashSet();
        for (int i = 0; i < nums.length; i++) {
            if (!set.add(nums[i])) {
                set.remove(nums[i]);
            }
        }
        return set.iterator().next();*/

        // 用位运算符
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result ^= nums[i];
        }
        return result;


    }

    public static void main(String[] args) {
        int[] nums = {2,2,1};
        System.out.println(Solution.singleNumber(nums));
    }
}