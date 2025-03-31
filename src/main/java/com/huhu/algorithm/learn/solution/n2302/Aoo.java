package com.huhu.algorithm.learn.solution.n2302;

/// # sliding window
class Aoo implements Solution {

    @Override
    public long countSubarrays(int[] nums, long k) {
        long sum = 0, res = 0;
        for (int n = 0, l = 0, r = 0; r < nums.length; r++) {
            sum += nums[r];
            n++;
            long score = sum * n;
            for (; score >= k; l++) {
                sum -= nums[l];
                n--;
                score = sum * n;
            }
            res += r - l + 1;
        }
        return res;
    }

}
