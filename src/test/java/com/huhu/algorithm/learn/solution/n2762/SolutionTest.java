package com.huhu.algorithm.learn.solution.n2762;

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
        int[] nums = {5, 4, 2, 4};
        assertEquals(8, solution.continuousSubarrays(nums));
    }

    @Test
    void test_b() {
        int[] nums = {1, 2, 3};
        assertEquals(6, solution.continuousSubarrays(nums));
    }

}