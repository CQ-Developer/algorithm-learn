package com.huhu.algorithm.learn.solution.n2904;

/// # sliding window
class Boo implements Solution {

    @Override
    public String shortestBeautifulSubstring(String s, int k) {
        int f = 0, n = s.length(), m = Integer.MAX_VALUE;
        for (int c = 0, l = 0, r = 0; r < n; r++) {
            c += s.charAt(r) & 1;
            for (; c >= k; l++) {
                if (c == k) {
                    int len = r - l + 1;
                    if (len < m) {
                        f = l;
                        m = len;
                    } else if (len == m) {
                        f = compare(s, len, f, l);
                    }
                }
                c -= s.charAt(l) & 1;
            }
        }
        return m == Integer.MAX_VALUE ? "" : s.substring(f, f + m);
    }

    private int compare(String s, int n, int i, int j) {
        for (int k = 0; k < n; k++) {
            char a = s.charAt(i + k), b = s.charAt(j + k);
            if (a != b) {
                return a == '0' ? i : j;
            }
        }
        return i;
    }

}
