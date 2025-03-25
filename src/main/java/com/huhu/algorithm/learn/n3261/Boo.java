package com.huhu.algorithm.learn.n3261;

/**
 * sliding window
 */
class Boo implements Solution {

    @Override
    public long[] countKConstraintSubstrings(String s, int k, int[][] queries) {
        char[] chars = s.toCharArray();
        int n = chars.length;
        // sliding window
        int[] cnt = new int[2];
        int[] left = new int[n];
        long[] pre = new long[n + 1];
        for (int l = 0, r = 0; r < n; r++) {
            cnt[chars[r] & 1]++;
            for (; cnt[0] > k && cnt[1] > k; l++) {
                cnt[chars[l] & 1]--;
            }
            left[r] = l;
            pre[r + 1] = pre[r] + r - l + 1;
        }
        // replace binary search with preprocessing
        int[] right = new int[n];
        for (int l = 0, r = 0; r < n; r++) {
            while (l < n && left[l] < r) {
                l++;
            }
            right[r] = l;
        }
        // precess result
        n = queries.length;
        long[] res = new long[n];
        for (int i = 0; i < n; i++) {
            int l = queries[i][0], r = queries[i][1];
            int j = Math.min(right[l], r + 1);
            res[i] = pre[r + 1] - pre[j] + (j - l + 1L) * (j - l) / 2;
        }
        return res;
    }

}
