package com.vincent.leetcode.simple;

import com.sun.tools.javac.util.Assert;

public class StrStr {
    public int strStr(String haystack, String needle) {
        if (needle == null || needle.equals("")) {
            return 0;
        }
        int needleIndex = 0;
        int result = -1;

        for (int i = 0; i < haystack.length();) {
            if (haystack.charAt(i) == needle.charAt(needleIndex)) {
                if (needleIndex == 0) {
                    result = i;
                }
                needleIndex++;
                if (needleIndex == needle.length()) {
                    return result;
                }
                i++;
            } else {
                if (result >= 0) {
                    i = result + 1;
                    result = -1;
                    needleIndex = 0;
                } else {
                    i++;
                }
            }
        }
        return needleIndex == needle.length() ? result : -1;

    }

    public static void main(String[] args) {
        StrStr strStr = new StrStr();
//        Assert.check(strStr.strStr("hello","ll") == 2);
        System.out.println(strStr.strStr("mississippi","pi"));
//        Assert.check(strStr.strStr("mississippi","pi") == -1);
    }
}
