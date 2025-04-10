package com.huhu.algorithm.learn.solution.n911;

class Aoo implements TopVotedCandidate {

    private final int[] winners, times;

    public Aoo(int[] persons, int[] times) {
        int n = persons.length;
        int[] winners = new int[n], counters = new int[n];
        for (int cur = 0, i = 0; i < n; i++) {
            if (++counters[persons[i]] >= counters[cur]) {
                cur = persons[i];
            }
            winners[i] = cur;
        }
        this.times = times;
        this.winners = winners;
    }

    /**
     * binary search in (l...r)
     */
    @Override
    public int q(int t) {
        int l = -1, r = times.length;
        while (l + 1 < r) {
            int m = l + (r - l) / 2;
            // times[l] <= t < times[r]
            if (times[m] > t) {
                r = m;
            } else {
                l = m;
            }
        }
        // l + 1 == r
        return winners[l];
    }

}
