package com.huhu.algorithm.learn.solution.n34;

/**
 * binary search
 */
class Coo implements Solution {

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
     * 开区间
     */
    private int search(int[] nums, int tar) {
        int l = -1, r = nums.length;
        while (l + 1 < r) {
            int m = l + (r - l) / 2;
            if (nums[m] < tar) {
                l = m;
            } else {
                r = m;
            }
        }
        return r;
    }

}
