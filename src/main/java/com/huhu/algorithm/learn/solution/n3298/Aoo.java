package com.huhu.algorithm.learn.solution.n3298;

/// # sliding window
class Aoo implements Solution {

    @Override
    public long validSubstringCount(String word1, String word2) {
        int[] w2 = new int[27];
        for (int i = 0; i < word2.length(); i++) {
            if (w2[word2.charAt(i) & 0x1f]++ == 0) {
                w2[0]++;
            }
        }
        long res = 0;
        int[] w1 = new int[27];
        for (int l = 0, r = 0; r < word1.length(); r++) {
            int c1 = word1.charAt(r) & 0x1f;
            if (w1[c1]++ == 0 && w2[c1] > 0) {
                w1[0]++;
            }
            for (; w1[0] >= w2[0] && check(w1, w2); l++) {
                int c2 = word1.charAt(l) & 0x1f;
                if (--w1[c2] == 0 && w2[c2] > 0) {
                    w1[0]--;
                }
            }
            res += l;
        }
        return res;
    }

    private boolean check(int[] w1, int[] w2) {
        for (int i = 1; i < 27; i++) {
            if (w1[i] < w2[i]) {
                return false;
            }
        }
        return true;
    }

}
