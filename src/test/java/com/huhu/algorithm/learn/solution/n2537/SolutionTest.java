package com.huhu.algorithm.learn.solution.n2537;

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
        int[] nums = {1, 1, 1, 1, 1};
        assertEquals(1, solution.countGood(nums, 10));
    }

    @Test
    void test_b() {
        int[] nums = {3, 1, 4, 3, 2, 2, 4};
        assertEquals(4, solution.countGood(nums, 2));
    }

}