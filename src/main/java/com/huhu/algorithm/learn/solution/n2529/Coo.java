package com.huhu.algorithm.learn.solution.n2529;

/**
 * binary search
 */
class Coo implements Solution {

    @Override
    public int maximumCount(int[] nums) {
        return Math.max(search(nums, 0), nums.length - search(nums, 1));
    }

    /**
     * (l...r]
     */
    private int search(int[] nums, int tar) {
        int l = -1, r = nums.length - 1;
        while (l < r) {
            int i = l + (r - l + 1) / 2;
            if (nums[i] >= tar) {
                r = i - 1;
            } else {
                l = i;
            }
        }
        return r + 1;
    }

}
