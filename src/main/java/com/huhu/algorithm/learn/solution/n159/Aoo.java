package com.huhu.algorithm.learn.solution.n159;

import java.util.HashMap;

/// # sliding window
class Aoo implements Solution {

    @Override
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        int longest = 0;
        var map = new HashMap<Character, Integer>();
        for (int l = 0, r = 0; r < s.length(); r++) {
            map.merge(s.charAt(r), 1, Integer::sum);
            for (; map.size() > 2; l++) {
                map.computeIfPresent(s.charAt(l), (k, v) -> v == 1 ? null : v - 1);
            }
            longest = Math.max(longest, r - l + 1);
        }
        return longest;
    }

}
