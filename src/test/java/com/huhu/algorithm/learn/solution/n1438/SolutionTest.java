package com.huhu.algorithm.learn.solution.n1438;

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
        int[] nums = {8, 2, 4, 7};
        assertEquals(2, solution.longestSubarray(nums, 4));
    }

    @Test
    void test_b() {
        int[] nums = {10, 1, 2, 4, 7, 2};
        assertEquals(4, solution.longestSubarray(nums, 5));
    }

    @Test
    void test_c() {
        int[] nums = {4, 2, 2, 2, 4, 4, 2, 2};
        assertEquals(3, solution.longestSubarray(nums, 0));
    }

}