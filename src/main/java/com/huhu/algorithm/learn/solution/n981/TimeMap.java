package com.huhu.algorithm.learn.solution.n981;

/**
 * <a href="https://leetcode.cn/problems/time-based-key-value-store/description/">
 * 981 time based key-value store
 * </a>
 */
interface TimeMap {

    void set(String key, String value, int timestamp);

    String get(String key, int timestamp);

}
