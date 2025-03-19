package com.huhu.algorithm.learn.n2799;

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
        int[] nums = {1, 3, 1, 2, 2};
        assertEquals(4, solution.countCompleteSubarray(nums));
    }

    @Test
    void test_b() {
        int[] nums = {5, 5, 5, 5};
        assertEquals(10, solution.countCompleteSubarray(nums));
    }

}