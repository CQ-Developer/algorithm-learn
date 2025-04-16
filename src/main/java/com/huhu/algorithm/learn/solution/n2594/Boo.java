package com.huhu.algorithm.learn.solution.n2594;

class Boo implements Solution {

    @Override
    public long repairCars(int[] ranks, int cars) {
        int mn = ranks[0];
        int[] cnt = new int[101];
        for (int r : ranks) {
            mn = Math.min(mn, r);
            cnt[r]++;
        }
        long l = 0, r = (long) mn * cars * cars;
        while (l + 1 < r) {
            long m = l + (r - l) / 2;
            long sum = 0;
            for (int rk = mn; rk <= 100 && sum < cars; rk++) {
                sum += (long) Math.sqrt(m / rk) * cnt[rk];
            }
            if (sum >= cars) {
                r = m;
            } else {
                l = m;
            }
        }
        return r;
    }

}
