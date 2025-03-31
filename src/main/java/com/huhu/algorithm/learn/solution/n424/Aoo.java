package com.huhu.algorithm.learn.solution.n424;

/**
 * sliding window
 */
class Aoo implements Solution {

    @Override
    public int characterReplacement(String s, int k) {
        int res = 0, n = s.length();
        int[] arr = new int[26];
        for (int mx = 0, l = 0, r = 0; r < n; r++) {
            mx = Math.max(mx, ++arr[s.charAt(r) - 'A']);
            for (; r - l + 1 - mx > k; l++) {
                arr[s.charAt(l) - 'A']--;
            }
            res = Math.max(res, r - l + 1);
        }
        return res;
    }

}
