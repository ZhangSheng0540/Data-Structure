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




        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,2};
        System.out.println(RemoveDuplicates.removeDuplicates(nums));
    }
}
