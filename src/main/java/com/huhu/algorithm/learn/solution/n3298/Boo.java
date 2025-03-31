package com.huhu.algorithm.learn.solution.n3298;

/// # sliding window
class Boo implements Solution {

    @Override
    public long validSubstringCount(String word1, String word2) {
        int[] arr = new int[27];
        for (int i = 0; i < word2.length(); i++) {
            if (arr[word2.charAt(i) & 0x1f]++ == 0) {
                arr[0]++;
            }
        }
        long res = 0;
        for (int l = 0, r = 0; r < word1.length(); r++) {
            if (--arr[word1.charAt(r) & 0x1f] == 0) {
                arr[0]--;
            }
            for (; arr[0] == 0; l++) {
                if (arr[word1.charAt(l) & 0x1f]++ == 0) {
                    arr[0]++;
                }
            }
            res += l;
        }
        return res;
    }

}
