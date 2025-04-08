package com.huhu.algorithm.learn.solution.n1818;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

abstract class SolutionTest {

    Solution solution;

    abstract Solution getSolution();

    @BeforeEach
    void setup() {
        solution = getSolution();
    }

    @Test
    void test_a() {
        assertEquals(3, solution.minAbsoluteSumDiff(new int[]{1, 7, 5}, new int[]{2, 3, 5}));
    }

    @Test
    void test_b() {
        assertEquals(0, solution.minAbsoluteSumDiff(new int[]{2, 4, 6, 8, 10}, new int[]{2, 4, 6, 8, 10}));
    }

    @Test
    void test_c() {
        assertEquals(20, solution.minAbsoluteSumDiff(new int[]{1, 10, 4, 4, 2, 7}, new int[]{9, 3, 5, 1, 7, 4}));
    }

}