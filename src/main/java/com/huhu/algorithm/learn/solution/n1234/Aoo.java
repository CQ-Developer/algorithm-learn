package com.huhu.algorithm.learn.solution.n1234;

/// # sliding window
class Aoo implements Solution {

    @Override
    public int balancedString(String s) {
        int n = s.length();
        int[] cnt = new int[27];
        for (int i = 0; i < n; i++) {
            cnt[s.charAt(i) & 0x1f]++;
        }
        int m = n / 4;
        if (cnt[5] == m && cnt[17] == m && cnt[18] == m && cnt[23] == m) {
            return 0;
        }
        int mn = n;
        for (int l = 0, r = 0; r < n; r++) {
            cnt[s.charAt(r) & 0x1f]--;
            for (; l <= r && cnt[5] <= m && cnt[17] <= m && cnt[18] <= m && cnt[23] <= m; l++) {
                cnt[s.charAt(l) & 0x1f]++;
                mn = Math.min(mn, r - l + 1);
            }
        }
        return mn;
    }

}
