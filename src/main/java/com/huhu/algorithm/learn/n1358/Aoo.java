package com.huhu.algorithm.learn.n1358;

/// # sliding window
class Aoo implements Solution {

    @Override
    public int numberOfSubstrings(String s) {
        char[] chars = s.toCharArray();
        int res = 0, n = chars.length;
        int[] cnt = new int[4];
        for (int l = 0, r = 0; r < n; r++) {
            cnt[chars[r] & 31]++;
            for (; cnt[1] > 0 && cnt[2] > 0 && cnt[3] > 0; l++) {
                cnt[chars[l] & 31]--;
            }
            res += l;
        }
        return res;
    }

}
