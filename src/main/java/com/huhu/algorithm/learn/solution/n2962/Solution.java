package com.huhu.algorithm.learn.solution.n2962;

/// # [count subarrays where max element appears at least k times](https://leetcode.cn/problems/count-subarrays-where-max-element-appears-at-least-k-times/description/)
///
/// you are given integer array `nums` and a positive integer `k`.
///
/// return the number of subarrays where the ***maximum*** element of
/// `nums` appears ***at least*** `k` times in that subarray.
///
/// a **subarray** is a contiguous sequence of elements within an array.
interface Solution {

    long countSubarrays(int[] nums, int k);

}
