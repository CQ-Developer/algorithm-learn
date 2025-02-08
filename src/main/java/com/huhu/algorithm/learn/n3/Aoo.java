package com.huhu.algorithm.learn.n3;

import java.util.HashSet;

/**
 * AC
 * sliding window
 */
class Aoo implements Solution {

    @Override
    public int lengthOfLongestSubstring(String s) {
        var set = new HashSet<Character>();
        int n = s.length(), l = 0, r = 0, mx = 0;
        while (r < n) {
            if (set.contains(s.charAt(r))) {
                set.remove(s.charAt(l));
                l++;
            } else {
                set.add(s.charAt(r));
                r++;
                mx = Math.max(mx, set.size());
            }
        }
        return mx;
    }

}
