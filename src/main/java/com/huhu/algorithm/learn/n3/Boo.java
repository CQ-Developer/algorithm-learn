package com.huhu.algorithm.learn.n3;

import java.util.HashSet;

/**
 * AC
 * sliding window
 */
class Boo implements Solution {

    @Override
    public int lengthOfLongestSubstring(String s) {
        char[] c = s.toCharArray();
        int n = c.length;

        var set = new HashSet<Character>();
        int l = 0, r = 0, mx = 0;

        while (r < n) {
            while (set.contains(c[r])) {
                set.remove(c[l]);
                l++;
            }
            set.add(c[r]);
            r++;
            mx = Math.max(mx, r - l);
        }

        return mx;
    }

}
