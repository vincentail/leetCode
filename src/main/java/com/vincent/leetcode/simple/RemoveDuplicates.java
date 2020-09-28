package com.vincent.leetcode.simple;

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        if (nums.length<=1) {
            return nums.length;
        }
        int size = 0;
        for (int i=1;i<nums.length;i++) {
            if (nums[i] != nums[size] && ((size++) != i)) {
                nums[size] = nums[i];
            }
        }
        return size + 1;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0,0,1,1,1,2,2,3,3,4};
        int size = new RemoveDuplicates().removeDuplicates(nums);
        System.out.println(size);
        for (int i = 0;i<size;i++) {
            System.out.println(nums[i]);
        }
        System.out.println(nums);
    }
}
