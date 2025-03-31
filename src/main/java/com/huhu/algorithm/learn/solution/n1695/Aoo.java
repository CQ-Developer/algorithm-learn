package com.huhu.algorithm.learn.solution.n1695;

/**
 * sliding window
 */
class Aoo implements Solution {

    @Override
    public int maximumUniqueSubarray(int[] nums) {
        int m = 0;
        for (int num : nums) {
            m = Math.max(m, num);
        }
        boolean[] visited = new boolean[m + 1];
        int n = nums.length, mx = 0;
        for (int sum = 0, l = 0, r = 0; r < n; r++) {
            for (; visited[nums[r]]; l++) {
                visited[nums[l]] = false;
                sum -= nums[l];
            }
            visited[nums[r]] = true;
            sum += nums[r];
            mx = Math.max(mx, sum);
        }
        return mx;
    }

}
