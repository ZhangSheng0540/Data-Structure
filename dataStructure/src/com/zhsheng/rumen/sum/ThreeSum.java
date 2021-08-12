package com.zhsheng.rumen.sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @program: Data-Structure
 * @className: ThreeSum
 * @description: 三数之和
 * @author: zhangsheng
 * @date: 2021年08月12日 15:57
 **/
public class ThreeSum {

    
    /**
     * 给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？请你找出所有和为 0 且不重复的三元组。
     *
     * 注意：答案中不可以包含重复的三元组。
     *
     **/
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();

        // 先将数组排序
        Arrays.sort(nums);

        for (int k = 0; k < nums.length - 2 ; k++) {

            // 定义两个指针 一直指向头，一个指向尾
            int i = k + 1;
            int j = nums.length - 1;


            // 如果遍历的这个指大于0 的话，则整个数组结果肯定是大于0的，因为数组是已经排好序的，后边的那个指针肯定也是大于0的
            if (nums[k] > 0) {
                return lists;
            }

            if ( k > 0 && nums[k] == nums[k - 1]) {
                continue;
            }

            while ( i < j) {
                int sum = nums[k] + nums[i] + nums[j];
                if (sum == 0) {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[k]);
                    list.add(nums[i]);
                    list.add(nums[j]);
                    lists.add(list);

                    while (i < j && nums[i] == nums[++i]) {

                    }
                    while (i < j && nums[j] == nums[--j]) {

                    }

                } else if (sum < 0) {
                    // 小于0的话 证明左指针小了，往右移动一位
                    while (i < j && nums[i] == nums[++i]) {

                    }

                } else if (sum > 0) {
                    // 大于0的话 证明右指针大了，往左移动一位
                    while (i < j && nums[j] == nums[--j]) {

                    }

                }
            }
        }

        return lists;
    }

    public static void main(String[] args) {
        int[] sums = {-1,0,1,2,-1,-4};
//        int[] sums = {-4,-1,-1,0,1,2};
        System.out.println(ThreeSum.threeSum(sums).stream().map(String::valueOf).collect(Collectors.joining(",")));
    }
}
