package com.vincent.leetcode.medium;

import java.util.HashMap;
import java.util.Map;

/**
 * 通过hash表记录每个字符串最新的位置，然后比较最大的子串长度
 */
public class LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int len = 0;
        int low = 0;
        Map<Character,Integer> indexMap = new HashMap<Character, Integer>();
        for (int high = 0;high < s.length();high++) {
            Integer tmp = null;
            if ((tmp = indexMap.get(s.charAt(high))) != null) {
                low = Math.max(low,tmp+1);
            } else {
                len++;
            }
            len = Math.max(len, high - low + 1);
            indexMap.put(s.charAt(high),high);
        }
        return len;
    }

    public static void main(String[] args) {
        System.out.println(new LengthOfLongestSubstring().lengthOfLongestSubstring("bbbbb"));
    }
}
