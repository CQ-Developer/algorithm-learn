package com.huhu.algorithm.learn.n1248;

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
        int[] nums = {1, 1, 2, 1, 1};
        assertEquals(2, solution.numberOfSubarrays(nums, 3));
    }

    @Test
    void test_b() {
        int[] nums = {2, 4, 6};
        assertEquals(0, solution.numberOfSubarrays(nums, 1));
    }

    @Test
    void test_c() {
        int[] nums = {2, 2, 2, 1, 2, 2, 1, 2, 2, 2};
        assertEquals(16, solution.numberOfSubarrays(nums, 2));
    }

}