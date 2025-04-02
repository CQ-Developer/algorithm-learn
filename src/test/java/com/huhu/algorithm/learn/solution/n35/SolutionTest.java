package com.huhu.algorithm.learn.solution.n35;

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
        int[] nums = {1, 3, 5, 6};
        assertEquals(2, solution.searchInsert(nums, 5));
    }

    @Test
    void test_b() {
        int[] nums = {1, 3, 5, 6};
        assertEquals(1, solution.searchInsert(nums, 2));
    }

    @Test
    void test_c() {
        int[] nums = {1, 3, 5, 6};
        assertEquals(4, solution.searchInsert(nums, 7));
    }

}