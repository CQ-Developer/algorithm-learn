package com.huhu.algorithm.learn.solution.n3488;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Aoo implements Solution {

    @Override
    public List<Integer> solveQueries(int[] nums, int[] queries) {
        // 记录每个数字出现的下标
        int n = nums.length;
        Map<Integer, List<Integer>> index = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int x = nums[i];
            if (!index.containsKey(x)) {
                index.put(x, new ArrayList<>());
            }
            index.get(x).add(i);
        }
        // 在下标前后添加哨兵
        for (List<Integer> list : index.values()) {
            int i = list.getFirst();
            list.addFirst(list.getLast() - n);
            list.addLast(i + n);
        }
        // 二分查找
        List<Integer> res = new ArrayList<>();
        for (int query : queries) {
            List<Integer> list = index.get(nums[query]);
            if (list.size() == 3) {
                res.add(-1);
            } else {
                int j = Collections.binarySearch(list, query);
                res.add(Math.min(query - list.get(j - 1), list.get(j + 1) - query));
            }
        }
        return res;
    }

}
