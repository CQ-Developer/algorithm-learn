package com.huhu.algorithm.learn.n2107;

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
    void testA() {
        int[] candies = {1, 2, 2, 3, 4, 3};
        assertEquals(3, solution.shareCandies(candies, 3));
    }

    @Test
    void testB() {
        int[] candies = {2, 2, 2, 2, 3, 3};
        assertEquals(2, solution.shareCandies(candies, 2));
    }

    @Test
    void testC() {
        int[] candies = {2, 4, 5};
        assertEquals(3, solution.shareCandies(candies, 0));
    }

}
