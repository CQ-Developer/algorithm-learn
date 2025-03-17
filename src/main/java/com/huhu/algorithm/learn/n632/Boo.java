package com.huhu.algorithm.learn.n632;

import java.util.List;
import java.util.PriorityQueue;

/// # heap
class Boo implements Solution {

    @Override
    public int[] smallestRange(List<List<Integer>> nums) {
        var heap = new PriorityQueue<int[]>((a, b) -> a[0] - b[0]);
        int r = Integer.MIN_VALUE;
        for (int i = 0; i < nums.size(); i++) {
            int x = nums.get(i).get(0);
            heap.add(new int[]{x, i, 0});
            r = Math.max(r, x);
        }
        int left = heap.element()[0], right = r;
        while (heap.element()[2] + 1 < nums.get(heap.element()[1]).size()) {
            int[] top = heap.remove();
            top[0] = nums.get(top[1]).get(++top[2]);
            r = Math.max(r, top[0]);
            heap.add(top);
            int l = heap.element()[0];
            if (r - l < right - left) {
                left = l;
                right = r;
            }
        }
        return new int[]{left, right};
    }

}
