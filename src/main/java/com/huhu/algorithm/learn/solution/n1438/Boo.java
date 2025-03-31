package com.huhu.algorithm.learn.solution.n1438;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * sliding window & monotonic queue
 */
class Boo implements Solution {

    @Override
    public int longestSubarray(int[] nums, int limit) {
        int res = 0, n = nums.length;
        Deque<Integer> maxQ = new ArrayDeque<>(n), minQ = new ArrayDeque<>(n);
        for (int l = 0, r = 0; r < n; r++) {
            while (!maxQ.isEmpty() && nums[r] > maxQ.getLast()) {
                maxQ.removeLast();
            }
            maxQ.addLast(nums[r]);
            while (!minQ.isEmpty() && nums[r] < minQ.getLast()) {
                minQ.removeLast();
            }
            minQ.addLast(nums[r]);
            for (; maxQ.getFirst() - minQ.getFirst() > limit; l++) {
                if (maxQ.getFirst() == nums[l]) {
                    maxQ.removeFirst();
                }
                if (minQ.getFirst() == nums[l]) {
                    minQ.removeFirst();
                }
            }
            res = Math.max(res, r - l + 1);
        }
        return res;
    }

}
