package com.huhu.algorithm.learn.n3325;

/// # sliding window
class Aoo implements Solution {

    @Override
    public int numberOfSubstrings(String s, int k) {
        int[] cnt = new int[27];
        char[] chars = s.toCharArray();
        int n = chars.length, res = 0;
        for (int total = 0, l = 0, r = 0; r < n; r++) {
            if (++cnt[chars[r] & 31] == k) {
                total++;
            }
            for (; total > 0; l++) {
                if (cnt[chars[l] & 31]-- == k) {
                    total--;
                }
            }
            res += l;
        }
        return res;
    }

}
