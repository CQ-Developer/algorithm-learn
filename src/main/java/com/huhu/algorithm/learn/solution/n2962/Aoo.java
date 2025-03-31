package com.huhu.algorithm.learn.solution.n2962;

/// # sliding window
class Aoo implements Solution {

    @Override
    public long countSubarrays(int[] nums, int k) {
        int mx = 0, n = nums.length;
        for (int num : nums) {
            mx = Math.max(mx, num);
        }
        long res = 0;
        for (int cnt = 0, l = 0, r = 0; r < n; r++) {
            cnt += nums[r] == mx ? 1 : 0;
            for (; cnt >= k; l++) {
                cnt -= nums[l] == mx ? 1 : 0;
            }
            res += l;
        }
        return res;
    }

}
