package com.huhu.algorithm.learn.solution.n1712;

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
        int[] nums = {1, 1, 1};
        assertEquals(1, solution.waysToSplit(nums));
    }

    @Test
    void test_b() {
        int[] nums = {1, 2, 2, 2, 5, 0};
        assertEquals(3, solution.waysToSplit(nums));
    }

    @Test
    void test_c() {
        int[] nums = {3, 2, 1};
        assertEquals(0, solution.waysToSplit(nums));
    }

}