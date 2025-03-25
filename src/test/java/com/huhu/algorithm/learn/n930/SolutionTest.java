package com.huhu.algorithm.learn.n930;

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
        int[] nums = {1, 0, 1, 0, 1};
        assertEquals(4, solution.numSubarraysWithSum(nums, 2));
    }

    @Test
    void test_b() {
        int[] nums = {0, 0, 0, 0, 0};
        assertEquals(15, solution.numSubarraysWithSum(nums, 0));
    }

}