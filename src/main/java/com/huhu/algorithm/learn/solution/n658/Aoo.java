package com.huhu.algorithm.learn.solution.n658;

import java.util.ArrayList;
import java.util.List;

class Aoo implements Solution {

    @Override
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int l = search(arr, x), r = search(arr, x + 1);
        List<Integer> res = new ArrayList<>();
        for (int i = l; i < r && res.size() < k; i++) {
            res.add(arr[i]);
        }
        while (res.size() < k) {
            int a = l - 1 < 0 ? Integer.MAX_VALUE : Math.abs(arr[l - 1] - x);
            int b = r >= arr.length ? Integer.MAX_VALUE : Math.abs(arr[r] - x);
            if (a <= b) {
                res.addFirst(arr[--l]);
            } else {
                res.addLast(arr[r++]);
            }
        }
        return res;
    }

    /**
     * binary search
     */
    private int search(int[] arr, int x) {
        int l = -1, r = arr.length;
        while (l + 1 < r) {
            int m = l + (r - l) / 2;
            if (arr[m] >= x) {
                r = m;
            } else {
                l = m;
            }
        }
        return r;
    }

}
