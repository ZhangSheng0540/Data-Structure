package com.zhsheng.rumen.climbstairs;

import java.lang.reflect.Array;

/**
 * @program: Data-Structure
 * @className: ClimbStairs
 * @description: 爬楼梯
 * @author: zhangsheng
 * @date: 2021年08月13日 11:42
 **/
public class ClimbStairs {

    /**
     * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
     *
     * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
     *
     * 输入： 2
     * 输出： 2
     * 解释： 有两种方法可以爬到楼顶。
     * 1.  1 阶 + 1 阶
     * 2.  2 阶
     *
     * 输入： 3
     * 输出： 3
     * 解释： 有三种方法可以爬到楼顶。
     * 1.  1 阶 + 1 阶 + 1 阶
     * 2.  1 阶 + 2 阶
     * 3.  2 阶 + 1 阶
     **/
    public static int climbStairs(int n) {

        // 定义一个数组 存放每个台阶的方法
        int[] climbs = new int[n];
        // 第一个台阶 有1种方法
        climbs[0] = 1;
        if (n < 2) {
            return  climbs[0];
        }
        // 第二个台阶有2中方法
        climbs[1] = 2;

        // 之后的每一个台阶的方法 都是前边的方法的和 f(n-1) + f(n - 2)
        for (int i = 2; i < n ; i++) {
            climbs[i] = climbs[i - 1] + climbs[i - 2];
        }
        return climbs[n - 1];

    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(ClimbStairs.climbStairs(n));
    }
}
