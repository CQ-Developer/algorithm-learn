package com.huhu.algorithm.learn.solution.n704;

/**
 * binary search
 */
class Aoo implements Solution {

    /**
     * closed interval
     */
    @Override
    public int search(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        while (l <= r) {
            int i = l + (r - l) / 2;
            if (nums[i] >= target) {
                r = i - 1;
            } else {
                l = i + 1;
            }
        }
        if (l == nums.length || nums[l] != target) {
            return -1;
        }
        return l;
    }

}
