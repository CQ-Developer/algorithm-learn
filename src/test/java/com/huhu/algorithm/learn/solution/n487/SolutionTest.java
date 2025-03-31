package com.huhu.algorithm.learn.solution.n487;

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
        int[] nums = {1, 0, 1, 1, 0};
        assertEquals(4, solution.findMaxConsecutiveOnes(nums));
    }

    @Test
    void test_b() {
        int[] nums = {1, 0, 1, 1, 0, 1};
        assertEquals(4, solution.findMaxConsecutiveOnes(nums));
    }

    @Test
    void test_c() {
        int[] nums = {1, 1, 1, 1};
        assertEquals(4, solution.findMaxConsecutiveOnes(nums));
    }

    @Test
    void test_d() {
        int[] nums = {0, 0, 0, 0};
        assertEquals(1, solution.findMaxConsecutiveOnes(nums));
    }

    @Test
    void test_f() {
        int[] nums = {1, 1, 0, 1, 1, 1};
        assertEquals(6, solution.findMaxConsecutiveOnes(nums));
    }

    @Test
    void test_g() {
        int[] nums = {0, 1, 1, 1, 0, 1, 1, 0};
        assertEquals(6, solution.findMaxConsecutiveOnes(nums));
    }

    @Test
    void test_h() {
        int[] nums = {
                1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
                0, 1, 1, 1, 1, 1, 1, 1, 1, 1,
                1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
                1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
                0, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        assertEquals(40, solution.findMaxConsecutiveOnes(nums));
    }

    @Test
    void test_i() {
        int[] nums = {0};
        assertEquals(1, solution.findMaxConsecutiveOnes(nums));
    }

    @Test
    void test_j() {
        int[] nums = {1};
        assertEquals(1, solution.findMaxConsecutiveOnes(nums));
    }

}