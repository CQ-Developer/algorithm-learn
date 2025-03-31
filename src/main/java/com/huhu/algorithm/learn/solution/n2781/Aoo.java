package com.huhu.algorithm.learn.solution.n2781;

import java.util.HashSet;
import java.util.List;

/// # sliding window
class Aoo implements Solution {

    @Override
    public int longestValidSubstring(String word, List<String> forbidden) {
        var set = new HashSet<>(forbidden);
        int n = word.length(), res = 0;
        for (int l = 0, r = 0; r < n; r++) {
            for (int i = r; i >= l && i > r - 10; i--) {
                if (set.contains(word.substring(i, r + 1))) {
                    l = i + 1;
                    break;
                }
            }
            res = Math.max(res, r - l + 1);
        }
        return res;
    }

}
