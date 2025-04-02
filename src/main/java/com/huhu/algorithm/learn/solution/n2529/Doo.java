package com.huhu.algorithm.learn.solution.n2529;

/**
 * binary search
 */
class Doo implements Solution {

    @Override
    public int maximumCount(int[] nums) {
        return Math.max(search(nums, 0), nums.length - search(nums, 1));
    }

    /**
     * [l...r)
     */
    private int search(int[] nums, int target) {
        int l = 0, r = nums.length;
        while (l < r) {
            int i = l + (r - l) / 2;
            if (nums[i] >= target) {
                r = i;
            } else {
                l = i + 1;
            }
        }
        return r;
    }

}
