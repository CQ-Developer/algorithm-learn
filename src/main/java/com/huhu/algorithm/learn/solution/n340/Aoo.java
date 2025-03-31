package com.huhu.algorithm.learn.solution.n340;

/// # sliding window
class Aoo implements Solution {

    @Override
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        int longest = 0;
        int[] letters = new int[27];
        for (int l = 0, r = 0; r < s.length(); r++) {
            if (letters[s.charAt(r) & 31]++ == 0) {
                letters[0]++;
            }
            for (; letters[0] > k; l++) {
                if (--letters[s.charAt(l) & 31] == 0) {
                    letters[0]--;
                }
            }
            longest = Math.max(longest, r - l + 1);
        }
        return longest;
    }

}
