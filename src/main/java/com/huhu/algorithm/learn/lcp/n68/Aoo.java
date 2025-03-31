package com.huhu.algorithm.learn.lcp.n68;

import java.util.HashMap;

/// # sliding window
class Aoo implements Solution {

    @Override
    public int beautifulBouquet(int[] flowers, int cnt) {
        int res = 0;
        var count = new HashMap<Integer, Integer>();
        for (int l = 0, r = 0; r < flowers.length; r++) {
            count.merge(flowers[r], 1, Integer::sum);
            for (; count.get(flowers[r]) > cnt; l++) {
                count.merge(flowers[l], -1, Integer::sum);
            }
            res = (res + r - l + 1) % 1000000007;
        }
        return res;
    }

}
