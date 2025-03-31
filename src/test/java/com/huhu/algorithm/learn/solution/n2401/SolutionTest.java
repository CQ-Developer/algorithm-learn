package com.huhu.algorithm.learn.solution.n2401;

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
        int[] nums = {1, 3, 8, 48, 10};
        assertEquals(3, solution.longestNiceSubarray(nums));
    }

    @Test
    void test_b() {
        int[] nums = {3, 1, 5, 11, 13};
        assertEquals(1, solution.longestNiceSubarray(nums));
    }

}