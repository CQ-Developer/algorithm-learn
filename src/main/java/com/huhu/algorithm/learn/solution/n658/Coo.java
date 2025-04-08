package com.huhu.algorithm.learn.solution.n658;

import java.util.ArrayList;
import java.util.List;

class Coo implements Solution {

    @Override
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int l = search(arr, arr.length - k, k, x);
        List<Integer> res = new ArrayList<>();
        for (int i = l; i < l + k; i++) {
            res.add(arr[i]);
        }
        return res;
    }

    /**
     * binary search [l...r)
     */
    private int search(int[] arr, int r, int k, int x) {
        int l = 0;
        while (l < r) {
            int m = l + (r - l) / 2;
            if (x - arr[m] <= arr[m + k] - x) {
                r = m;
            } else {
                l = m + 1;
            }
        }
        return r;
    }

}
