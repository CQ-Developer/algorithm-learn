package com.huhu.algorithm.learn.solution.n3325;

/// # sliding window
class Boo implements Solution {

    @Override
    public int numberOfSubstrings(String s, int k) {
        int[] cnt = new int[26];
        char[] cs = s.toCharArray();
        int n = cs.length, res = 0;
        for (int l = 0, r = 0; r < n; r++) {
            cnt[cs[r] - 'a']++;
            for (; cnt[cs[r] - 'a'] >= k; l++) {
                cnt[cs[l] - 'a']--;
            }
            res += l;
        }
        return res;
    }

}
