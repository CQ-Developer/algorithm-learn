package com.huhu.algorithm.learn.solution.n395;

/// # brute force
class Aoo implements Solution {

    @Override
    public int longestSubstring(String s, int k) {
        char[] c = s.toCharArray();
        int res = 0, n = c.length;
        for (int l = 0; l < n; l++) {
            int unsatisfied = 0;
            int[] counts = new int[27];
            for (int r = l; r < n; r++) {
                if (++counts[c[r] & 31] == 1) {
                    unsatisfied++;
                }
                if (counts[c[r] & 31] == k) {
                    unsatisfied--;
                }
                if (unsatisfied == 0) {
                    res = Math.max(res, r - l + 1);
                }
            }
        }
        return res;
    }

}
