package com.huhu.algorithm.learn.solution.n704;

/**
 * binary search
 */
class Coo implements Solution {

    /**
     * open interval
     */
    @Override
    public int search(int[] nums, int target) {
        int l = -1, r = nums.length;
        while (l + 1 < r) {
            int i = l + (r - l) / 2;
            if (nums[i] >= target) {
                r = i;
            } else {
                l = i;
            }
        }
        if (r == nums.length || nums[r] != target) {
            return -1;
        }
        return r;
    }

}
