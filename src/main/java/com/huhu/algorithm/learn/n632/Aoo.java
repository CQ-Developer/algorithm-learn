package com.huhu.algorithm.learn.n632;

import java.util.Arrays;
import java.util.List;

/// # sliding window
class Aoo implements Solution {

    private record Pair(int i, int v) {}

    @Override
    public int[] smallestRange(List<List<Integer>> nums) {
        int n = 0;
        for (var list : nums) {
            n += list.size();
        }
        var pairs = new Pair[n];
        for (int j = 0, i = 0; i < nums.size(); i++) {
            for (var v : nums.get(i)) {
                pairs[j++] = new Pair(i, v);
            }
        }
        Arrays.sort(pairs, (a, b) -> a.v - b.v);
        int left = pairs[0].v, right = pairs[n - 1].v;
        int empty = nums.size();
        int[] cnt = new int[empty];
        for (int l = 0, r = 0; r < n; r++) {
            if (cnt[pairs[r].i]++ == 0) {
                empty--;
            }
            for (; empty == 0; l++) {
                if (pairs[r].v - pairs[l].v < right - left) {
                    left = pairs[l].v;
                    right = pairs[r].v;
                }
                if (--cnt[pairs[l].i] == 0) {
                    empty++;
                }
            }
        }
        return new int[]{left, right};
    }

}
