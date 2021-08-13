package com.zhsheng.rumen.maxarea;

/**
 * @program: Data-Structure
 * @className: MaxArea
 * @description: 11. 盛最多水的容器
 * @author: zhangsheng
 * @date: 2021年08月12日 18:28
 **/
public class MaxArea {

    public static int maxArea(int[] height) {
        // 定义两个指针用于 算出指针内的最大容量
        int i = 0;
        int j = height.length - 1;

        // 定义一个最大的值
        int max = 0;

        while (i < j) {
            int min = Math.min(height[i], height[j]);
            max = Math.max(max,min * (j - i));
            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] height = {1,2,1};
        System.out.println(MaxArea.maxArea(height));
    }
}
