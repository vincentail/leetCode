package com.vincent.leetcode.simple;

/**
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 * 示例 1:
 *
 * 输入: [1,3,5,6], 5
 * 输出: 2
 *
 * 思路：递归二分查找
 */
public class SearchInsert {
    public int searchInsert(int[] nums, int target) {
        if (nums.length == 0) {
            return 1;
        }
        if (nums[nums.length-1]<target) {
            return nums.length;
        }
        if (nums[0] > target) {
            return 0;
        }

        return insertIndex(nums,target,0,nums.length-1);

    }

    public int insertIndex(int[]nums,int target,int lowIndex,int highIndex) {
        if (highIndex - lowIndex <=1) {
            if (nums[highIndex] < target) {
                return highIndex+1;
            } else if (nums[highIndex] >= target && nums[lowIndex] < target) {
                return highIndex;
            } else if (nums[lowIndex] >= target) {
                return lowIndex;
            }
        }
        int mid = (highIndex + lowIndex)/2;
        if (nums[mid] > target) {
            return insertIndex(nums,target,lowIndex,mid);
        } else {
            return insertIndex(nums,target,mid,highIndex);
        }
    }
}
