package com.huhu.algorithm.learn.solution.n658;

import java.util.ArrayList;
import java.util.List;

/**
 * two pointers
 */
class Boo implements Solution {

    @Override
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int l = 0, r = arr.length - 1;
        while (r - l + 1 > k) {
            if (x - arr[l] <= arr[r] - x) {
                r--;
            } else {
                l++;
            }
        }
        List<Integer> res = new ArrayList<>(k);
        for (int i = l; i < l + k; i++) {
            res.add(arr[i]);
        }
        return res;
    }

}
