package com.huhu.algorithm.learn.solution.n1918;

/**
 * binary search & sliding window
 */
class Aoo implements Solution {

    @Override
    public int kthSmallestSubarraySum(int[] nums, int k) {
        int l = Integer.MAX_VALUE, r = 0;
        for (int num : nums) {
            l = Math.min(l, num);
            r += num;
        }
        while (l < r) {
            int m = (l + r) / 2;
            if (f(nums, m) >= k) {
                r = m;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    private int f(int[] nums, int tar) {
        int res = 0;
        for (int sum = 0, l = 0, r = 0; r < nums.length; r++) {
            sum += nums[r];
            for (; sum > tar; l++) {
                sum -= nums[l];
            }
            res += r - l + 1;
        }
        return res;
    }

}
