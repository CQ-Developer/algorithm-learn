package com.huhu.algorithm.learn.solution.n2594;

class Aoo implements Solution {

    @Override
    public long repairCars(int[] ranks, int cars) {
        int mn = ranks[0];
        for (int rank : ranks) {
            mn = Math.min(mn, rank);
        }
        long l = 0, r = (long) mn * cars * cars;
        while (l + 1 < r) {
            long m = l + (r - l) / 2, s = 0;
            for (int rank : ranks) {
                s += Math.sqrt(m / rank);
            }
            if (s >= cars) {
                r = m;
            } else {
                l = m;
            }
        }
        return r;
    }

}
