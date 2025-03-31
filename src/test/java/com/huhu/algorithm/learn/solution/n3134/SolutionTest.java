package com.huhu.algorithm.learn.solution.n3134;

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
        int[] nums = {1, 2, 3};
        assertEquals(1, solution.medianOfUniquenessArray(nums));
    }

    @Test
    void test_b() {
        int[] nums = {3, 4, 3, 4, 5};
        assertEquals(2, solution.medianOfUniquenessArray(nums));
    }

    @Test
    void test_c() {
        int[] nums = {4, 3, 5, 4};
        assertEquals(2, solution.medianOfUniquenessArray(nums));
    }

}