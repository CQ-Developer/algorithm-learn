package com.huhu.algorithm.learn.n713;

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
        int[] nums = {10, 5, 2, 6};
        assertEquals(8, solution.numSubarrayProductLessThanK(nums, 100));
    }

    @Test
    void test_b() {
        int[] nums = {1, 2, 3};
        assertEquals(0, solution.numSubarrayProductLessThanK(nums, 0));
    }

}