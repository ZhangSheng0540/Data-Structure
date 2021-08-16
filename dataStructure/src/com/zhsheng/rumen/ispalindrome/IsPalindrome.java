package com.zhsheng.rumen.ispalindrome;

/**
 * @program: Data-Structure
 * @className: IsPalindrome
 * @description: 回文字符串
 * @author: zhangsheng
 * @date: 2021年08月16日 21:09
 **/
public class IsPalindrome {

    public static boolean isPalindrome(String s) {
        // 将字符串 去掉空格和特殊字符 全部转换为小写
        String lowerCase = s.toLowerCase();
        char[] chars = lowerCase.toCharArray();
        String newString = "";
        for (int i = 0; i < chars.length; i++) {
            if (Character.isDigit(lowerCase.charAt(i)) || Character.isLetter(lowerCase.charAt(i))) {
                newString += lowerCase.charAt(i);
            }
        }
        int i = 0;
        int j = newString.length() - 1;
        while (i < j) {
            if (newString.charAt(j) != newString.charAt(i)) {
                return false;
            }
            i++;
            j--;
        }
        return true;

    }

    public static void main(String[] args) {
        String s = "race a car";
        System.out.println(IsPalindrome.isPalindrome(s));
    }
}
