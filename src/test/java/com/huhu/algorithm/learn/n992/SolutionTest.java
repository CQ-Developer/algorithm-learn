package com.huhu.algorithm.learn.n992;

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
        int[] nums = {1, 2, 1, 2, 3};
        assertEquals(7, solution.subarraysWithKDistinct(nums, 2));
    }

    @Test
    void test_b() {
        int[] nums = {1, 2, 1, 3, 4};
        assertEquals(3, solution.subarraysWithKDistinct(nums, 3));
    }

}