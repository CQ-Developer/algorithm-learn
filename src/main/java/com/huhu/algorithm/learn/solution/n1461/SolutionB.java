package com.huhu.algorithm.learn.solution.n1461;

import java.util.HashSet;
import java.util.Set;

/**
 * enumeration
 */
class SolutionB implements Solution {

    @Override
    public boolean hasAllCodes(String s, int k) {
        Set<String> set = new HashSet<>();
        for (int i = s.length() - k; i >= 0; i--) {
            set.add(s.substring(i, i + k));
        }
        return set.size() == 1 << k;
    }

}
