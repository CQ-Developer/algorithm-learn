package com.huhu.algorithm.learn.n2730;

/**
 * <h1>sliding window</h1>
 */
class Boo implements Solution {

    /**
     * <p>通过{@code l}和{@code r}维护最大窗口.</p>
     */
    @Override
    public int longestSemiRepetitiveSubstring(String s) {
        int n = s.length();
        int l = 0;
        for (int cnt = 0, r = 0; r < n; r++) {
            if (r > 0 && s.charAt(r) == s.charAt(r - 1)) {
                cnt++;
            }
            if (cnt > 1) {
                if (l < r && s.charAt(l) == s.charAt(l + 1)) {
                    cnt--;
                }
                l++;
            }
        }
        return n - l;
    }

}
