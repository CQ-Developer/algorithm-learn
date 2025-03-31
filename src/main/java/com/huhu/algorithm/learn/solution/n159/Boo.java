package com.huhu.algorithm.learn.solution.n159;

/// # sliding window
class Boo implements Solution {

    @Override
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        int longest = 0;
        int[] counter = new int[27];
        for (int l = 0, r = 0; r < s.length(); r++) {
            if (counter[s.charAt(r) & 31]++ == 0) {
                counter[0]++;
            }
            for (; counter[0] > 2; l++) {
                if (--counter[s.charAt(l) & 31] == 0) {
                    counter[0]--;
                }
            }
            longest = Math.max(longest, r - l + 1);
        }
        return longest;
    }

}
