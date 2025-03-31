package com.huhu.algorithm.learn.solution.n438;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Aoo implements Solution {

    @Override
    public List<Integer> findAnagrams(String s, String p) {
        char[] c1 = s.toCharArray(), c2 = p.toCharArray();
        int n = c1.length, m = c2.length;
        List<Integer> res = new ArrayList<>();
        if (n < m) {
            return res;
        }
        int[] target = new int[26], window = new int[26];
        for (int i = 0; i < m; i++) {
            target[c2[i] - 'a']++;
            window[c1[i] - 'a']++;
        }
        if (Arrays.equals(target, window)) {
            res.add(0);
        }
        for (int i = m; i < n; i++) {
            window[c1[i] - 'a']++;
            window[c1[i - m] - 'a']--;
            if (Arrays.equals(target, window)) {
                res.add(i - m + 1);
            }
        }
        return res;
    }

}
