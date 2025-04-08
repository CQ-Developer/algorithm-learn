package com.huhu.algorithm.learn.solution.n981;

import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/**
 * binary tree
 */
class Aoo implements TimeMap {

    private final Map<String, NavigableMap<Integer, String>> trees = new HashMap<>();

    public Aoo() {}

    @Override
    public void set(String key, String value, int timestamp) {
        trees.putIfAbsent(key, new TreeMap<>());
        trees.get(key).put(timestamp, value);
    }

    @Override
    public String get(String key, int timestamp) {
        var entry = trees.getOrDefault(key, new TreeMap<>()).floorEntry(timestamp);
        return entry == null ? "" : entry.getValue();
    }

}
