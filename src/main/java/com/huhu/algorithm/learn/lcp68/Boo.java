package com.huhu.algorithm.learn.lcp68;

/// # sliding window
class Boo implements Solution {

    @Override
    public int beautifulBouquet(int[] flowers, int cnt) {
        long res = 0;
        int[] count = new int[100001];
        for (int l = 0, r = 0; r < flowers.length; r++) {
            count[flowers[r]]++;
            for (; count[flowers[r]] > cnt; l++) {
                count[flowers[l]]--;
            }
            res += r - l + 1;
        }
        return (int) (res % 1000000007);
    }

}
