package com.huhu.algorithm.learn.solution.n1150;

class Boo implements Solution {

    @Override
    public boolean isMajorityElement(int[] nums, int target) {
        int n = nums.length;
        int l = -1, r = n;
        while (l + 1 < r) {
            int m = l + (r - l) / 2;
            if (nums[m] >= target) {
                r = m;
            } else {
                l = m;
            }
        }
        return r + n / 2 < n && nums[r + n / 2] == target;
    }

}
