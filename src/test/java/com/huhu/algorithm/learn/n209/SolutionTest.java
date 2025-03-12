package com.huhu.algorithm.learn.n209;

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
        int[] nums = {2, 3, 1, 2, 4, 3};
        assertEquals(2, solution.minSubArrayLen(7, nums));
    }

    @Test
    void test_b() {
        int[] nums = {1, 4, 4};
        assertEquals(1, solution.minSubArrayLen(4, nums));
    }

    @Test
    void test_c() {
        int[] nums = {1, 1, 1, 1, 1, 1, 1, 1};
        assertEquals(0, solution.minSubArrayLen(11, nums));
    }

}