package com.huhu.algorithm.learn.solution.n1610;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

///  # sliding window
class Aoo implements Solution {

    @Override
    public int visiblePoints(List<List<Integer>> points, int angle, List<Integer> location) {
        int cnt = 0, x = location.get(0), y = location.get(1);
        var list = new ArrayList<Double>();
        for (var point : points) {
            int a = point.get(0), b = point.get(1);
            if (a == x && b == y) {
                cnt++;
            } else {
                list.add(Math.atan2(a - x, b - y) + Math.PI);
            }
        }
        Collections.sort(list);
        int n = list.size();
        for (int i = 0; i < n; i++) {
            list.add(list.get(i) + 2 * Math.PI);
        }
        int mx = 0;
        for (int l = 0, r = 0; r < 2 * n; r++) {
            while (l < r && list.get(r) - list.get(l) > angle * Math.PI / 180) {
                l++;
            }
            mx = Math.max(mx, r - l + 1);
        }
        return mx + cnt;
    }

}
