package com.huhu.algorithm.learn.n2743;

/// # sliding window
class Aoo implements Solution {

    @Override
    public int numberOfSpecialSubstrings(String s) {
        var arr = s.toCharArray();
        int n = arr.length;
        int res = 0;
        int[] cnt = new int[27];
        for (int l = 0, r = 0; r < n; r++) {
            cnt[arr[r] & 0x1f]++;
            for (; cnt[arr[r] & 0x1f] > 1; l++) {
                cnt[arr[l] & 0x1f]--;
            }
            res += r - l + 1;
        }
        return res;
    }

}
