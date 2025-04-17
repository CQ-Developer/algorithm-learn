package com.huhu.algorithm.learn.solution.n3048;

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
        assertEquals(8, solution.earliestSecondToMarkIndices(new int[]{2, 2, 0}, new int[]{2, 2, 2, 2, 3, 2, 2, 1}));
    }

    @Test
    void test_b() {
        assertEquals(6, solution.earliestSecondToMarkIndices(new int[]{1, 3}, new int[]{1, 1, 1, 2, 1, 1, 1}));
    }

    @Test
    void test_c() {
        assertEquals(-1, solution.earliestSecondToMarkIndices(new int[]{0, 1}, new int[]{2, 2, 2}));
    }

}