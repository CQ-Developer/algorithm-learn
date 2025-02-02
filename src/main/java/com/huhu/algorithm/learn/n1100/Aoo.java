package com.huhu.algorithm.learn.n1100;

import java.util.HashMap;
import java.util.Map;

class Aoo implements Solution {

    @Override
    public int numKLenSubstrNoRepeats(String s, int k) {
        int n = s.length();
        if (k > n) {
            return 0;
        }
        Map<Character, Integer> w = new HashMap<>();
        for (int i = 0; i < k; i++) {
            w.merge(s.charAt(i), 1, Integer::sum);
        }
        int cnt = w.size() == k ? 1 : 0;
        for (int i = k; i < n; i++) {
            w.merge(s.charAt(i), 1, Integer::sum);
            w.computeIfPresent(s.charAt(i - k), (_k, v) -> v == 1 ? null : v - 1);
            if (w.size() == k) {
                cnt++;
            }
        }
        return cnt;
    }

}
