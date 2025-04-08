package com.huhu.algorithm.learn.solution.n1146;

import java.util.ArrayList;
import java.util.List;

class Aoo implements SnapshotArray {

    private record Item(int snapId, int val) {}

    private int cur;
    private final List<List<Item>> data;

    public Aoo(int length) {
        data = new ArrayList<>(length);
        for (int i = 0; i < length; i++) {
            data.add(new ArrayList<>());
        }
    }

    @Override
    public void set(int index, int val) {
        data.get(index).add(new Item(cur, val));
    }

    @Override
    public int snap() {
        return cur++;
    }

    @Override
    public int get(int index, int snap_id) {
        var versions = data.get(index);
        int i = search(versions, snap_id);
        return i < 0 ? 0 : versions.get(i).val;
    }

    /**
     * binary search
     */
    private int search(List<Item> list, int target) {
        int l = -1, r = list.size();
        while (l + 1 < r) {
            int m = l + (r - l) / 2;
            if (list.get(m).snapId <= target) {
                l = m;
            } else {
                r = m;
            }
        }
        return l;
    }

}
