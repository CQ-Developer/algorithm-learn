package com.huhu.algorithm.learn.solution.n3488;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

abstract class SolutionTest {

    Solution solution;

    abstract Solution getSolution();

    @BeforeEach
    void setup() {
        solution = getSolution();
    }

    @Test
    void test_a() {
        int[] nums = {1, 3, 1, 4, 1, 3, 2}, queries = {0, 3, 5};
        assertIterableEquals(List.of(2, -1, 3), solution.solveQueries(nums, queries));
    }

    @Test
    void test_b() {
        int[] nums = {1, 2, 3, 4}, queries = {0, 1, 2, 3};
        assertIterableEquals(List.of(-1, -1, -1, -1), solution.solveQueries(nums, queries));
    }

}