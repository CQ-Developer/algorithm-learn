package com.huhu.algorithm.learn.solution.n2300;

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
        int[] spells = {5, 1, 3}, potions = {1, 2, 3, 4, 5};
        int success = 7;
        int[] result = {4, 0, 3};
        assertArrayEquals(result, solution.successfulPairs(spells, potions, success));
    }

    @Test
    void test_b() {
        int[] spells = {3, 1, 2}, potions = {8, 5, 8};
        int success = 16;
        int[] result = {2, 0, 2};
        assertArrayEquals(result, solution.successfulPairs(spells, potions, success));
    }

}