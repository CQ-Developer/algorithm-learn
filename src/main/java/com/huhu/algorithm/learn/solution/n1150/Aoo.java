package com.huhu.algorithm.learn.solution.n1150;

class Aoo implements Solution {

    @Override
    public boolean isMajorityElement(int[] nums, int target) {
        int n = nums.length;
        int l = search(nums, target);
        if (l < n && nums[l] == target) {
            int r = search(nums, target + 1);
            return (r - l) * 2 > n;
        }
        return false;
    }

    /**
     * binary search
     */
    private int search(int[] nums, int target) {
        int l = -1, r = nums.length;
        while (l + 1 < r) {
            int m = l + (r - l) / 2;
            if (nums[m] >= target) {
                r = m;
            } else {
                l = m;
            }
        }
        return r;
    }

}
