package com.huhu.algorithm.learn.solution.n3296;

import java.util.PriorityQueue;

class Boo implements Solution {

    @Override
    public long minNumberOfSeconds(int mountainHeight, int[] workerTimes) {
        PriorityQueue<long[]> queue = new PriorityQueue<>((a, b) -> Long.compare(a[0], b[0]));
        for (int t : workerTimes) {
            queue.add(new long[]{t, t, t});
        }
        long res = 0;
        while (mountainHeight-- > 0) {
            long[] w = queue.remove();
            long a = w[0], b = w[1], c = w[2];
            res = a;
            queue.add(new long[]{a + b + c, b + c, c});
        }
        return res;
    }

}
