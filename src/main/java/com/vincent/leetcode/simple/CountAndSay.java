package com.vincent.leetcode.simple;

public class CountAndSay {
    public String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }
        String desc = countAndSay(n-1);
        char pre = desc.charAt(0);
        StringBuilder s = new StringBuilder();
        int count = 1;
        for(int i=1; i<desc.length(); i++) {
            if(pre == desc.charAt(i)) {
                count++;
            } else {
                s.append(count).append(pre);
                pre=desc.charAt(i);
                count=1;
            }
        }
        s.append(count).append(pre);
        return s.toString();
    }
}
