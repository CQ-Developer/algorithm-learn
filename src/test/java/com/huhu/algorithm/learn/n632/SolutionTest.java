package com.huhu.algorithm.learn.n632;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

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
        List<List<Integer>> nums = List.of(
                List.of(4, 10, 15, 24, 26),
                List.of(0, 9, 12, 20),
                List.of(5, 18, 22, 30));
        int[] actual = solution.smallestRange(nums);
        int[] expect = {20, 24};
        assertArrayEquals(expect, actual);
    }

    @Test
    void test_b() {
        List<List<Integer>> nums = List.of(
                List.of(1, 2, 3),
                List.of(1, 2, 3),
                List.of(1, 2, 3));
        int[] actual = solution.smallestRange(nums);
        int[] expect = {1, 1};
        assertArrayEquals(expect, actual);
    }

}