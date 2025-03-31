package com.huhu.algorithm.learn.solution.n76;

/// # sliding window
class Aoo implements Solution {

    @Override
    public String minWindow(String s, String t) {
        int m = t.length();
        int[] need = new int[123];
        for (int i = 0; i < m; i++) {
            need[t.charAt(i)]++;
        }
        int[] window = new int[123];
        int n = s.length(), f = -1, len = n + 1;
        for (int cnt = 0, l = 0, r = 0; r < n; r++) {
            char c = s.charAt(r);
            if (++window[c] <= need[c]) {
                cnt++;
            }
            for (; cnt == m; l++) {
                if (r - l + 1 < len) {
                    len = r - (f = l) + 1;
                }
                c = s.charAt(l);
                if (window[c]-- <= need[c]) {
                    cnt--;
                }
            }
        }
        return f < 0 ? "" : s.substring(f, f + len);
    }

}
