package com.huhu.algorithm.learn.solution.n2953;

/**
 * sliding window - AC
 */
class Aoo implements Solution {

    @Override
    public int countCompleteSubstrings(String word, int k) {
        int res = 0, n = word.length();
        for (int i = 0; i < n; ) {
            int j = i + 1;
            while (j < n && Math.abs(word.charAt(j) - word.charAt(j - 1)) <= 2) {
                j++;
            }
            res += f(word.substring(i, j), k);
            i = j;
        }
        return res;
    }

    private int f(String str, int k) {
        char[] s = str.toCharArray();
        int res = 0, n = s.length;
        // m种字符, 每种k个, 窗口大小为 w = m * k
        for (int m = 1; m <= 26 && m * k <= n; m++) {
            int[] cnt = new int[26];
            for (int r = 0, w = m * k; r < n; r++) {
                // 进入窗口
                cnt[s[r] - 'a']++;
                // 通过窗口的左边界判断窗口是否满了
                int l = r + 1 - w;
                if (l < 0) {
                    continue;
                }
                // 检查窗口
                boolean ok = true;
                for (int i = 0; ok && i < 26; i++) {
                    ok = cnt[i] <= 0 || cnt[i] == k;
                }
                // 更新结果
                if (ok) {
                    res++;
                }
                // 左侧出窗
                cnt[s[l] - 'a']--;
            }
        }
        return res;
    }

}
