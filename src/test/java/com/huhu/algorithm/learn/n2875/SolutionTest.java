package com.huhu.algorithm.learn.n2875;

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
        int[] nums = {1, 2, 3};
        assertEquals(2, solution.minSizeSubarray(nums, 5));
    }

    @Test
    void test_b() {
        int[] nums = {1, 1, 1, 2, 3};
        assertEquals(2, solution.minSizeSubarray(nums, 4));
    }

    @Test
    void test_c() {
        int[] nums = {2, 4, 6, 8};
        assertEquals(-1, solution.minSizeSubarray(nums, 3));
    }

    @Test
    void test_d() {
        int[] nums = {1, 2, 2, 2, 1, 2, 1, 2, 1, 2, 1};
        assertEquals(53, solution.minSizeSubarray(nums, 83));
    }

}