package com.zhsheng.rumen.dailytemperatures;

import java.util.Arrays;

/**
 * @program: Data-Structure
 * @className: DailyTemperatures
 * @description: 每日温度
 * @author: zhangsheng
 * @date: 2021年08月16日 11:50
 **/
public class DailyTemperatures {

    /**
     * 请根据每日 气温 列表 temperatures ，请计算在每一天需要等几天才会有更高的温度。如果气温在这之后都不会升高，请在该位置用 0 来代替。
     * 输入: temperatures = [73,74,75,71,69,72,76,73]
     * 输出: [1,1,4,2,1,1,0,0]
     **/
    public static int[] dailyTemperatures(int[] temperatures) {
        int[] newArray = new int[temperatures.length];

        return newArray;

    }

    // 暴力解法 双层for循环
    public static int[] dailyTemperatures1(int[] temperatures) {
        int[] newArray = new int[temperatures.length];
        for (int i = 0; i < temperatures.length; i++) {
            for (int j = i + 1; j < temperatures.length; j++) {
                if (temperatures[j] > temperatures[i]) {
                    newArray[i] = j - i;
                    break;
                }
                newArray[i] = 0;
            }
        }
        return newArray;

    }

    public static void main(String[] args) {
        int[] temperatures = {30,60,90};
        System.out.println(Arrays.toString(DailyTemperatures.dailyTemperatures(temperatures)));
    }
}
