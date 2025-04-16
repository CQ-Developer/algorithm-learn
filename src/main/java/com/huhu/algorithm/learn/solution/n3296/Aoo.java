package com.huhu.algorithm.learn.solution.n3296;

class Aoo implements Solution {

    @Override
    public long minNumberOfSeconds(int mountainHeight, int[] workerTimes) {
        long mx = 0;
        for (int workerTime : workerTimes) {
            mx = Math.max(mx, workerTime);
        }
        int h = (mountainHeight - 1) / workerTimes.length + 1;
        long l = 0, r = mx * h * (h + 1) / 2;
        while (l + 1 < r) {
            long m = l + (r - l) / 2;
            if (check(workerTimes, m, mountainHeight)) {
                r = m;
            } else {
                l = m;
            }
        }
        return r;
    }

    private boolean check(int[] workTimes, long m, int high) {
        for (int t : workTimes) {
            high -= ((int) Math.sqrt(8.0 * m / t + 1) - 1) / 2;
            if (high <= 0) {
                return true;
            }
        }
        return false;
    }

}
