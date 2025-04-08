package com.huhu.algorithm.learn.solution.n1146;

import java.util.ArrayList;
import java.util.List;
import java.util.NavigableMap;
import java.util.TreeMap;

/**
 * binary tree
 */
class Boo implements SnapshotArray {

    private int version;
    private final List<NavigableMap<Integer, Integer>> trees;

    public Boo(int length) {
        trees = new ArrayList<>(length);
        for (int i = 0; i < length; i++) {
            var item = new TreeMap<Integer, Integer>();
            item.put(0, 0);
            trees.add(item);
        }
    }

    @Override
    public void set(int index, int val) {
        trees.get(index).put(version, val);
    }

    @Override
    public int snap() {
        return version++;
    }

    @Override
    public int get(int index, int snap_id) {
        return trees.get(index).floorEntry(snap_id).getValue();
    }

}
