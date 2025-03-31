package com.huhu.algorithm.learn.solution.n1461;

/**
 * sliding window
 */
class SolutionA implements Solution {

    @Override
    public boolean hasAllCodes(String s, int k) {
        char[] c = s.toCharArray();
        int n = c.length;
        if (n < k) {
            return false;
        }
        int m = 1 << k;
        int[] nums = new int[m];
        int i = 0;
        for (int j = 0; j < k; j++) {
            i = (i << 1) | (c[j] - '0');
        }
        int res = nums[i] = 1;
        for (int j = k; j < n; j++) {
            i = ((i << 1) | (c[j] - '0')) & (m - 1);
            res += 1 ^ nums[i];
            nums[i] = 1;
        }
        return res == m;
    }

}
