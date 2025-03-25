package com.huhu.algorithm.learn.n3261;

import java.util.Arrays;

/**
 * sliding window
 */
class Coo implements Solution {

    @Override
    public long[] countKConstraintSubstrings(String s, int k, int[][] queries) {
        char[] chars = s.toCharArray();
        int n = chars.length;
        // sliding window
        int[] cnt = new int[2];
        int[] right = new int[n];
        long[] pre = new long[n + 1];
        int l = 0;
        for (int r = 0; r < n; r++) {
            cnt[chars[r] & 1]++;
            for (; cnt[0] > k && cnt[1] > k; l++) {
                cnt[chars[l] & 1]--;
                right[l] = r;
            }
            pre[r + 1] = pre[r] + r - l + 1;
        }
        Arrays.fill(right, l, n, n);
        // precess result
        n = queries.length;
        long[] res = new long[n];
        for (int i = 0; i < n; i++) {
            int _l = queries[i][0], _r = queries[i][1];
            int j = Math.min(right[_l], _r + 1);
            res[i] = pre[_r + 1] - pre[j] + (j - _l + 1L) * (j - _l) / 2;
        }
        return res;
    }

}
