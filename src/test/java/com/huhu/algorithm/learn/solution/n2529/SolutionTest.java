package com.huhu.algorithm.learn.solution.n2529;

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
        int[] nums = {-2, -1, -1, 1, 2, 3};
        assertEquals(3, solution.maximumCount(nums));
    }

    @Test
    void test_b() {
        int[] nums = {-3, -2, -1, 0, 0, 1, 2};
        assertEquals(3, solution.maximumCount(nums));
    }

    @Test
    void test_c() {
        int[] nums = {5, 20, 66, 1314};
        assertEquals(4, solution.maximumCount(nums));
    }

}