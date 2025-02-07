package com.huhu.algorithm.learn.n30;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * sliding window - AC
 */
class Boo implements Solution {

    @Override
    public List<Integer> findSubstring(String s, String[] words) {
        int wordLen = words[0].length(), wordCnt = words.length;
        int strLen = s.length(), winLen = wordLen * wordCnt;
        List<Integer> res = new ArrayList<>();
        if (strLen < winLen) {
            return res;
        }
        for (int i = 0; i < wordLen; i++) {
            int r = i + winLen;
            if (r > strLen) {
                break;
            }
            // setup window
            int l = i;
            Map<String, Integer> cur = new HashMap<>();
            for (int j = i; j < r; j += wordLen) {
                cur.merge(s.substring(j, j + wordLen), 1, Integer::sum);
            }
            for (String word : words) {
                cur.merge(word, -1, Integer::sum);
                cur.remove(word, 0);
            }
            if (cur.isEmpty()) {
                res.add(l);
            }
            // check
            while (r + wordLen <= strLen) {
                // out
                String word = s.substring(l, l + wordLen);
                cur.merge(word, -1, Integer::sum);
                cur.remove(word, 0);
                // in
                word = s.substring(r, r + wordLen);
                cur.merge(word, 1, Integer::sum);
                cur.remove(word, 0);
                // update
                l += wordLen;
                r += wordLen;
                if (cur.isEmpty()) {
                    res.add(l);
                }
            }
        }
        return res;
    }

}
