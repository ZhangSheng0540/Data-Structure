package com.zhsheng.rumen.array;

import java.util.*;

/**
 * @program: Data-Structure
 * @className: RemoveDuplicates
 * @description: 删除重复数组
 * @author: zhangsheng
 * @date: 2021年08月02日 20:20
 **/
public class RemoveDuplicates {

    /**
     * 给你一个有序数组 nums ，请你 原地 删除重复出现的元素，使每个元素 只出现一次 ，返回删除后数组的新长度。
     *
     * 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
     **/
    public static int removeDuplicates(int[] nums) {
        // set去重
        /*Set<Integer> set = new LinkedHashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        Iterator<Integer> iterator = set.iterator();
        for (int i = 0; i < set.size(); i++) {
            nums[i]=iterator.next();
        }
        Arrays.sort(nums,0,set.size());*/


        // 指针法   ++i 和i++的区别  i++和++i都直接对i进行了i=i+1的操作，但是不同的是i++得到的是i未进行加法操作的前的值的副本，而++i直接得到计算后的值
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums[j]) {
                j++;
                nums[j] = nums[i];
            }
        }
        return j + 1;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,2};
        System.out.println(RemoveDuplicates.removeDuplicates(nums));
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(nums[i]), i};
            }
            map.put(nums[i], i);
        }
        return new int[0];
    }
}
