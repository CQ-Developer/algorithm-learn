package com.huhu.algorithm.learn.solution.n1297;

import java.util.HashMap;
import java.util.Map;

/**
 * sliding window - AC
 */
class Aoo implements Solution {

    @Override
    public int maxFreq(String s, int maxLetters, int minSize, int maxSize) {
        Map<Character, Integer> window = new HashMap<>();
        for (int i = 0; i < minSize; i++) {
            char c = s.charAt(i);
            window.merge(c, 1, Integer::sum);
        }
        Map<String, Integer> cnt = new HashMap<>();
        if (window.size() <= maxLetters) {
            cnt.merge(s.substring(0, minSize), 1, Integer::sum);
        }
        for (int i = minSize; i < s.length(); i++) {
            window.merge(s.charAt(i), 1, Integer::sum);
            window.computeIfPresent(s.charAt(i - minSize), (k, v) -> v == 1 ? null : v - 1);
            if (window.size() <= maxLetters) {
                cnt.merge(s.substring(i - minSize + 1, i + 1), 1, Integer::sum);
            }
        }
        int res = 0;
        for (int value : cnt.values()) {
            res = Math.max(res, value);
        }
        return res;
    }

}
