package com.huhu.algorithm.learn.solution.n704;

/**
 * binary search
 */
class Boo implements Solution {

    /**
     * left-closed right-open interval
     */
    @Override
    public int search(int[] nums, int target) {
        int l = 0, r = nums.length;
        while (l < r) {
            int i = l + (r - l) / 2;
            if (nums[i] >= target) {
                r = i;
            } else {
                l = i + 1;
            }
        }
        if (r == nums.length || nums[r] != target) {
            return -1;
        }
        return r;
    }

}
