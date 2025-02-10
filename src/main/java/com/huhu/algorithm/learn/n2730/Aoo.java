package com.huhu.algorithm.learn.n2730;

/**
 * <h1>sliding window</h1>
 */
class Aoo implements Solution {

    @Override
    public int longestSemiRepetitiveSubstring(String s) {
        int n = s.length(), mx = 0;
        for (int cnt = 0, l = 0, r = 0; r < n; r++) {
            if (r > 0 && s.charAt(r) == s.charAt(r - 1)) {
                cnt++;
            }
            for (; cnt > 1; l++) {
                if (l < r && s.charAt(l) == s.charAt(l + 1)) {
                    cnt--;
                }
            }
            mx = Math.max(mx, r - l + 1);
        }
        return mx;
    }

}
