package com.huhu.algorithm.learn.solution.n2563;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

abstract class SolutionTest {

    Solution solution;

    abstract Solution getSolution();

    @BeforeEach
    void setup() {
        solution = getSolution();
    }

    @Test
    void test_a() {
        int[] nums = {0, 1, 7, 4, 4, 5};
        Assertions.assertEquals(6, solution.countFairPairs(nums, 3, 6));
    }

    @Test
    void test_b() {
        int[] nums = {1, 7, 9, 2, 5};
        Assertions.assertEquals(1, solution.countFairPairs(nums, 11, 11));
    }

}