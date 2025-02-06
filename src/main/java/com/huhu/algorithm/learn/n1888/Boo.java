package com.huhu.algorithm.learn.n1888;

/**
 * sliding window - AC
 */
class Boo implements Solution {

    @Override
    public int minFlips(String s) {
        char[] chars = s.toCharArray(), target = {'0', '1'};
        int n = chars.length, cnt = 0;
        for (int i = 0; i < n; i++) {
            cnt += chars[i] ^ target[i & 1];
        }
        int res = Math.min(cnt, n - cnt);
        if ((n & 1) == 0) {
            return res;
        }
        for (int i = 0; i < n; i++) {
            cnt -= chars[i] ^ target[i & 1];
            cnt += chars[i] ^ target[i & 1] ^ 1;
            res = Math.min(res, Math.min(cnt, n - cnt));
        }
        return res;
    }

}
