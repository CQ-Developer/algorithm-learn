package com.huhu.algorithm.learn.solution.n1016;

import java.util.HashSet;

/**
 * sliding window - AC
 */
class Boo implements Solution {

    @Override
    public boolean queryString(String s, int n) {
        char[] c = s.toCharArray();
        var set = new HashSet<Integer>();
        for (int i = 0, m = c.length; i < m; i++) {
            int x = c[i] - '0';
            if (x == 0) {
                continue;
            }
            for (int j = i + 1; x <= n; j++) {
                set.add(x);
                if (j == m) {
                    break;
                }
                x = (x << 1) | (c[j] - '0');
            }
        }
        return set.size() == n;
    }

}
