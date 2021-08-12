package com.zhsheng.rumen.array;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @program: Data-Structure
 * @className: Rotate
 * @description: 数组旋转
 * @author: zhangsheng
 * @date: 2021年08月03日 16:13
 **/
public class Rotate {


    /**
     * 给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
     * 输入: nums = [1,2,3,4,5,6,7], k = 3
     * 输出: [5,6,7,1,2,3,4]
     * 解释:
     * 向右旋转 1 步: [7,1,2,3,4,5,6]  0-->3  1-->4 2-->5 3-->6 4-->7&length=0 5-->8%length=1 6-->6+3%7=2 7-->7+3%7=3
     * 向右旋转 2 步: [6,7,1,2,3,4,5]
     * 向右旋转 3 步: [5,6,7,1,2,3,4]
     **/
    public static void rotate(int[] nums, int k) {
        /*int[] newArray = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            newArray[(i + k) % nums.length] = nums[i];
        }

        System.arraycopy(newArray, 0,nums,0,nums.length);*/

        // 翻转数组的方式
        reverse(nums, 0, nums.length - 1);// 先整个翻转
        reverse(nums, 0, k - 1); // 再翻转前边的部分
        reverse(nums, k, nums.length - 1);  // 最后翻转后边的
    }

    /**
     * @author zhangsheng
     * @description 翻转数组
     * @date 2021年08月03日 16:45
     * @param [nums, i, length] 【数组，从第几个开始， 从第几个结束】
     * @return void
     **/
    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end ] = temp;
            start += 1;
            end -= 1;

        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        Rotate.rotate(nums, k);
        System.out.println(Arrays.toString(nums));
    }
}
