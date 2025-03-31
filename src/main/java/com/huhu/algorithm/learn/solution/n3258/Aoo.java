package com.huhu.algorithm.learn.solution.n3258;

/// # sliding window
class Aoo implements Solution {

    @Override
    public int countKConstraintSubstrings(String s, int k) {
        int res = 0;
        int[] cnt = {0, 0};
        for (int l = 0, r = 0; r < s.length(); r++) {
            cnt[s.charAt(r) & 1]++;
            for (; cnt[0] > k && cnt[1] > k; l++) {
                cnt[s.charAt(l) & 1]--;
            }
            res += r - l + 1;
        }
        return res;
    }

}
