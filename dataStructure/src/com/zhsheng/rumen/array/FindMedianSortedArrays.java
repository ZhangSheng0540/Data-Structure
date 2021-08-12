package com.zhsheng.rumen.array;

import java.util.Arrays;

/**
 * @program: Data-Structure
 * @className: FindMedianSortedArrays
 * @description: 寻找两个正序数组的中位数
 * @author: zhangsheng
 * @date: 2021年08月04日 09:53
 **/
public class FindMedianSortedArrays {
    
    /**
     *  给定两个大小分别为 m 和 n 的正序（从小到大）数组 nums1 和 nums2。请你找出并返回这两个正序数组的 中位数 。
     * 输入：nums1 = [1,3], nums2 = [2]
     * 输出：2.00000
     * 解释：合并数组 = [1,2,3] ，中位数 2
     **/
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // 合并两个集合
        int j = 0;
        for (int i = 0; i < nums1.length; i++) {
            System.out.println(++j);
        }
        return 0;


    }

    public static void main(String[] args) {
        int[] nums1 = {1,3};
        int[] nums2 = {2};

        ThreadLocal<String> threadLocal = new ThreadLocal<>();
        threadLocal.set("111");
        threadLocal.get();
        threadLocal.remove();

        System.out.println(FindMedianSortedArrays.findMedianSortedArrays(nums1, nums2));
    }
}
