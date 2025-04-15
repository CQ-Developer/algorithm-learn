package com.huhu.algorithm.learn.solution.n2187;

class Aoo implements Solution {

    @Override
    public long minimumTime(int[] time, int totalTrips) {
        long max = 0;
        for (int t : time) {
            max = Math.max(max, t);
        }
        long l = 1, r = max * totalTrips;
        while (l <= r) {
            long m = l + (r - l) / 2;
            if (check(time, m, totalTrips)) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    private boolean check(int[] time, long t, int totalTrips) {
        long trip = 0;
        for (int x : time) {
            trip += t / x;
            if (trip >= totalTrips) {
                return true;
            }
        }
        return false;
    }

}
