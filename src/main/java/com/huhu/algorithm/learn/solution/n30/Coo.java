package com.huhu.algorithm.learn.solution.n30;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * sliding window - AC
 */
class Coo implements Solution {

    @Override
    public List<Integer> findSubstring(String s, String[] words) {
        int n = words[0].length();
        if (s.length() < n * words.length) {
            return List.of();
        }
        Map<String, Integer> tar = new HashMap<>();
        for (String word : words) {
            tar.merge(word, 1, Integer::sum);
        }
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int cnt = 0, l = i, r = i;
            Map<String, Integer> cur = new HashMap<>();
            while (r + n <= s.length()) {
                var word = s.substring(r, r += n);
                if (tar.containsKey(word)) {
                    cur.merge(word, 1, Integer::sum);
                    cnt++;
                    // 如果当前单词的数量超过了目标数量，需要收缩窗口
                    while (cur.get(word) > tar.get(word)) {
                        cur.merge(s.substring(l, l += n), -1, Integer::sum);
                        cnt--;
                    }
                    // 当匹配的单词数量等于 words 数组的长度时，说明找到了一个串联子串
                    if (cnt == words.length) {
                        result.add(l);
                        // 收缩窗口，移除最左边的单词
                        cur.merge(s.substring(l, l += n), -1, Integer::sum);
                        cnt--;
                    }
                } else {
                    l = r;
                    cnt = 0;
                    cur.clear();
                }
            }
        }
        return result;
    }

}
