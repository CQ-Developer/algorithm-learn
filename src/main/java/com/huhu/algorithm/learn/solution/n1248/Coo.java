package com.huhu.algorithm.learn.solution.n1248;

/**
 * prefix sum
 */
class Coo implements Solution {

    @Override
    public int numberOfSubarrays(int[] nums, int k) {
        int n = nums.length, res = 0;
        // pre[s] = v
        // amount of subarrays with a prefix sum of s is v.
        int[] pre = new int[n + 1];
        pre[0] = 1;
        for (int s = 0, i = 0; i < n; i++) {
            pre[s += nums[i] & 1]++;
            if (s >= k) {
                res += pre[s - k];
            }
        }
        return res;
    }

}
