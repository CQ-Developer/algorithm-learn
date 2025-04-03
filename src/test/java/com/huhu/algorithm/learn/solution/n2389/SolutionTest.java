package com.huhu.algorithm.learn.solution.n2389;

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
        int[] nums = {4, 5, 2, 1}, queries = {3, 10, 21};
        int[] result = {2, 3, 4};
        assertArrayEquals(result, solution.answerQueries(nums, queries));
    }

    @Test
    void test_b() {
        int[] nums = {2, 3, 4, 5}, queries = {1};
        int[] result = {0};
        assertArrayEquals(result, solution.answerQueries(nums, queries));
    }

    @Test
    void test_c() {
        int[] nums = {736411, 184882, 914641, 37925, 214915}, queries = {331244, 273144, 118983, 118252, 305688, 718089, 665450};
        int[] result = {2, 2, 1, 1, 2, 3, 3};
        assertArrayEquals(result, solution.answerQueries(nums, queries));
    }

}