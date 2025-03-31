package com.huhu.algorithm.learn.solution.n395;

/// # sliding window
class Coo implements Solution {

    @Override
    public int longestSubstring(String s, int k) {
        char[] chars = s.toCharArray();
        int n = chars.length, res = 0;
        // 要求窗口内最多存在g种字符
        for (int g = 1; g <= 26; g++) {
            // total: 窗口内字符的总量
            // unsatisfied: 窗口内数量未达到k个的字符总量
            int total = 0, unsatisfied = 0;
            int[] cnt = new int[27];
            for (int l = 0, r = 0; r < n; r++) {
                // 右侧字符进入窗口
                if (++cnt[chars[r] & 31] == 1) {
                    total++;
                    unsatisfied++;
                }
                if (cnt[chars[r] & 31] == k) {
                    unsatisfied--;
                }
                // 左侧字符离开窗口
                for (; total > g; l++) {
                    if (--cnt[chars[l] & 31] == k - 1) {
                        unsatisfied++;
                    }
                    if (cnt[chars[l] & 31] == 0) {
                        total--;
                        unsatisfied--;
                    }
                }
                // 窗口内所有字符的数量都大于等于k
                if (unsatisfied == 0) {
                    res = Math.max(res, r - l + 1);
                }
            }
        }
        return res;
    }

}
