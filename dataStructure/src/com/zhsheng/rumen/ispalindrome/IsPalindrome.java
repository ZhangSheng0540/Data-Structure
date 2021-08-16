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

        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            while (i < j && !Character.isLetterOrDigit(s.charAt(i))) {
                i++;
            }
            while (i < j && !Character.isLetterOrDigit(s.charAt(j))) {
                j--;
            }
            if (i < j ) {
                if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
                    return false;
                }
                i++;
                j--;
            }
        }
        return true;

    }

    public static boolean isPalindrome1(String s) {
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
        String s = "A man, a plan, a canal: Panama";
        System.out.println(IsPalindrome.isPalindrome(s));
    }
}
