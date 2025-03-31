package com.huhu.algorithm.learn.solution.n220;

import java.util.HashMap;

/**
 * AC
 * sliding window
 * bucket sort
 */
class Coo implements Solution {

    @Override
    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        int offset = Integer.MAX_VALUE;
        for (int num : nums) {
            offset = Math.min(offset, num);
        }
        int n = nums.length;
        var bucket = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            // 通过 num - offset 防止负数的存在
            // 通过 valueDiff + 1 将差值在 valueDiff 内的 num 分配到一个桶内
            int num = nums[i], j = (num - offset) / (valueDiff + 1);
            // 如果当前桶内有数字, 那么它和num的差值一定小于等于valueDiff, 否在不会分配在同一个桶内
            if (bucket.containsKey(j)) {
                return true;
            }
            // 注意可能分配到相邻的桶
            var prev = bucket.get(j - 1);
            if (prev != null && num - prev <= valueDiff) {
                return true;
            }
            var next = bucket.get(j + 1);
            if (next != null && next - num <= valueDiff) {
                return true;
            }
            // 进入窗口
            bucket.put(j, num);
            // 窗口未满
            if (i < indexDiff) {
                continue;
            }
            // 离开窗口
            bucket.remove((nums[i - indexDiff] - offset) / (valueDiff + 1));
        }
        return false;
    }

}
