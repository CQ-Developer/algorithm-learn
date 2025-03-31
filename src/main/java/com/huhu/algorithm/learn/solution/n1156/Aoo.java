package com.huhu.algorithm.learn.solution.n1156;

/**
 * sliding window
 */
class Aoo implements Solution {

    @Override
    public int maxRepOpt1(String text) {
        char[] s = text.toCharArray();
        int n = s.length;
        // cnt
        int[] cnt = new int[26];
        for (char c : s) {
            cnt[c - 'a']++;
        }
        // sliding window
        int res = 0, l = 0;
        while (l < n) {
            int r = l;
            while (r < n && s[r] == s[l]) {
                r++;
            }
            int left = r - l;
            int k = r + 1;
            while (k < n && s[k] == s[l]) {
                k++;
            }
            int right = k - r - 1;
            res = Math.max(res, Math.min(left + right + 1, cnt[s[l] - 'a']));
            l = r;
        }
        return res;
    }

}
