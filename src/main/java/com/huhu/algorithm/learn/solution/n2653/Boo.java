package com.huhu.algorithm.learn.solution.n2653;

/**
 * sliding window - AC
 */
class Boo implements Solution {

    @Override
    public int[] getSubarrayBeauty(int[] nums, int k, int x) {
        int n = nums.length;
        int[] window = new int[50 + 50 + 1], res = new int[n - k + 1];
        for (int i = 0; i < n; i++) {
            // enter window
            window[nums[i] + 50]++;
            if (i < k - 1) {
                continue;
            }
            // window is full
            int cnt = x;
            // from -50 to -1
            for (int j = 0; j < 50; j++) {
                cnt -= window[j];
                if (cnt <= 0) {
                    res[i - k + 1] = j - 50;
                    break;
                }
            }
            // leave window
            window[nums[i - k + 1] + 50]--;
        }
        return res;
    }

}
