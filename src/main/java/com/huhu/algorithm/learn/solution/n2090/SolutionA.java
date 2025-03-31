package com.huhu.algorithm.learn.solution.n2090;

/**
 * sliding window
 */
class SolutionA implements Solution {

    @Override
    public int[] getAverages(int[] nums, int k) {
        long sm = 0;
        int n = nums.length;
        int[] avg = new int[n];
        for (int i = 0; i < n; i++) {
            // out of range
            if (i < k || i + k >= n) {
                avg[i] = -1;
            }
            // enter the window
            sm += nums[i];
            if (i >= 2 * k) {
                avg[i - k] = (int) (sm / (2 * k + 1));
                // leave the window
                sm -= nums[i - 2 * k];
            }
        }
        return avg;
    }

}
