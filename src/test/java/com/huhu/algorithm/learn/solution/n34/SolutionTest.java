package com.huhu.algorithm.learn.solution.n34;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

abstract class SolutionTest {

    Solution solution;

    abstract Solution getSolution();

    @BeforeEach
    void setup() {
        solution = getSolution();
    }

    @Test
    void test_a() {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int[] expected = {3, 4};
        assertArrayEquals(expected, solution.searchRange(nums, 8));
    }

    @Test
    void test_b() {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int[] expected = {-1, -1};
        assertArrayEquals(expected, solution.searchRange(nums, 6));
    }

    @Test
    void test_c() {
        int[] nums = {};
        int[] expected = {-1, -1};
        assertArrayEquals(expected, solution.searchRange(nums, 0));
    }

}