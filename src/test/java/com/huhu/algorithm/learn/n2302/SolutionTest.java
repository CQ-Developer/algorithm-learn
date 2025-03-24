package com.huhu.algorithm.learn.n2302;

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
        int[] nums = {2, 1, 4, 3, 5};
        assertEquals(6, solution.countSubarrays(nums, 10));
    }

    @Test
    void test_b() {
        int[] nums = {1, 1, 1};
        assertEquals(5, solution.countSubarrays(nums, 5));
    }

}