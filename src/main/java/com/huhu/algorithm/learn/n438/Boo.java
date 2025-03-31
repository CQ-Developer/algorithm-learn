package com.huhu.algorithm.learn.n438;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * sliding window
 */
class Boo implements Solution {

    @Override
    public List<Integer> findAnagrams(String s, String p) {
        char[] cs = p.toCharArray();
        int m = cs.length;
        int[] tar = new int[26];
        for (char c : cs) {
            tar[c - 'a']++;
        }
        cs = s.toCharArray();
        int n = cs.length;
        int[] cur = new int[26];
        List<Integer> res = new ArrayList<>();
        for (int l = 0, r = 0; r < n; r++) {
            cur[cs[r] - 'a']++;
            if (r - l + 1 > m) {
                cur[cs[l++] - 'a']--;
            }
            if (Arrays.equals(cur, tar)) {
                res.add(l);
            }
        }
        return res;
    }

}
