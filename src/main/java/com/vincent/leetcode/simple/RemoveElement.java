package com.vincent.leetcode.simple;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        if (nums.length == 0 || (nums.length == 1 && nums[0] == val)) {
            return 0;
        }
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                if (i!=index) {
                    nums[index] = nums[i];
                }
                index++;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2,0,1,2,2,3,0,4,2};
        int size = new RemoveElement().removeElement(nums,2);
        System.out.println(size);
        for (int i = 0;i<size;i++) {
            System.out.println(nums[i]);
        }
    }
}
