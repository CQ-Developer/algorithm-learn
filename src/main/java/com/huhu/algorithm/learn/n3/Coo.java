package com.huhu.algorithm.learn.n3;

import java.util.HashMap;

/**
 * AC
 * sliding window
 */
class Coo implements Solution {

    @Override
    public int lengthOfLongestSubstring(String s) {
        char[] c = s.toCharArray();
        int n = c.length;

        var map = new HashMap<Character, Integer>();
        int mx = 0;

        for (int l = 0, r = 0; r < n; r++) {
            int p = map.getOrDefault(c[r], -1);
            if (p >= l) {
                l = p + 1;
            }
            map.put(c[r], r);
            mx = Math.max(mx, r - l + 1);
        }

        return mx;
    }

}
