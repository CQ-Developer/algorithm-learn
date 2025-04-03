package com.huhu.algorithm.learn.solution.n2080;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

abstract class RangeFreqQueryTest {

    abstract RangeFreqQuery getRangeFreqQuery(int[] arr);

    @Test
    void test_a() {
        int[] arr = {12, 33, 4, 56, 22, 2, 34, 33, 22, 12, 34, 56};
        var solution = getRangeFreqQuery(arr);
        int[] resul = {1, 2};
        assertArrayEquals(resul, new int[]{solution.query(1, 2, 4), solution.query(0, 11, 33)});
    }

}