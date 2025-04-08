package com.huhu.algorithm.learn.solution.n1146;

/**
 * <a href="https://leetcode.cn/problems/snapshot-array/description/">
 * 1146 snapshot array
 * </a>
 */
interface SnapshotArray {

    void set(int index, int val);

    int snap();

    int get(int index, int snap_id);

}
