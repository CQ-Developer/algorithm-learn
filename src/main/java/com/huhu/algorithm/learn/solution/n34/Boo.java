package com.huhu.algorithm.learn.solution.n34;

/**
 * binary search
 */
class Boo implements Solution {

    @Override
    public int[] searchRange(int[] nums, int target) {
        int i = search(nums, target);
        if (i == nums.length || nums[i] != target) {
            return new int[]{-1, -1};
        }
        int j = search(nums, target + 1) - 1;
        return new int[]{i, j};
    }

    /**
     * 左闭右开
     */
    private int search(int[] nums, int tar) {
        int l = 0, r = nums.length;
        while (l < r) {
            int m = l + (r - l) / 2;
            if (nums[m] < tar) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        // r == l
        return l;
    }

}
