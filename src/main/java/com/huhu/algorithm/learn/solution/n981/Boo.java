package com.huhu.algorithm.learn.solution.n981;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Boo implements TimeMap {

    private record Item(int timestamp, String value) {}

    private final Map<String, List<Item>> data = new HashMap<>();

    public Boo() {}

    @Override
    public void set(String key, String value, int timestamp) {
        data.putIfAbsent(key, new ArrayList<>());
        data.get(key).add(new Item(timestamp, value));
    }

    @Override
    public String get(String key, int timestamp) {
        var items = data.getOrDefault(key, new ArrayList<>());
        int i = search(items, timestamp);
        return i < 0 ? "" : items.get(i).value;
    }

    /**
     * binary search
     */
    private int search(List<Item> items, int target) {
        int l = -1, r = items.size();
        while (l + 1 < r) {
            int m = l + (r - l) / 2;
            if (items.get(m).timestamp <= target) {
                l = m;
            } else {
                r = m;
            }
        }
        return l;
    }

}
