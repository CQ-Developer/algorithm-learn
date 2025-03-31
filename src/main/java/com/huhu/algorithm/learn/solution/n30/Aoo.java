package com.huhu.algorithm.learn.solution.n30;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * brute force - AC
 */
class Aoo implements Solution {

    @Override
    public List<Integer> findSubstring(String s, String[] words) {
        Map<String, Integer> tar = new HashMap<>(), cur = new HashMap<>();
        for (String word : words) {
            tar.merge(word, 1, Integer::sum);
        }
        int n = s.length(), w = words[0].length(), k = words.length * w;
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i + k <= n; i++) {
            String sub = s.substring(i, i + k);
            cur.clear();
            for (int j = 0; j < k; j += w) {
                cur.merge(sub.substring(j, j + w), 1, Integer::sum);
            }
            if (tar.equals(cur)) {
                res.add(i);
            }
        }
        return res;
    }

}
