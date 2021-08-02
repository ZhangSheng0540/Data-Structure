package com.zhsheng.rumen.binary;


import java.util.Arrays;
import java.util.List;

/**
 * @program: Data-Structure
 * @className: BinarySearch01
 * @description: 二分查找01
 * @author: zhangsheng
 * @date: 2021年08月02日 15:32
 **/
public class Solution {

    /**
     * 给定一个 n 个元素有序的（升序）整型数组 nums 和一个目标值 target  ，写一个函数搜索 nums 中的 target，如果目标值存在返回下标，否则返回 -1。
     * 示例 1:
     *
     * 输入: nums = [-1,0,3,5,9,12], target = 9
     * 输出: 4
     * 解释: 9 出现在 nums 中并且下标为 4
     * 示例 2:
     *
     * 输入: nums = [-1,0,3,5,9,12], target = 2
     * 输出: -1
     * 解释: 2 不存在 nums 中因此返回 -1
     *  
     *
     * 提示：
     *
     * 你可以假设 nums 中的所有元素是不重复的。
     * n 将在 [1, 10000]之间。
     * nums 的每个元素都将在 [-9999, 9999]之间。
     *
     **/

    public static int search(int[] nums, int target) {
//        for (int i = 0; i < nums.length; i++) {
//            if (target == nums[i]) {
//                return i;
//            }
//        }
//        return -1;

        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;  // 防止right + left 两个数直接相加导致的数据量太大 超出数据范围
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            }
        }
        return -1;


    }


    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12,15};
        int target1 = 9;

        System.out.println(Solution.search(nums, target1));
    }
}