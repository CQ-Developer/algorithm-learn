package com.huhu.algorithm.learn.n2106;

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
        int[][] fruits = {{2, 8}, {6, 3}, {8, 6}};
        assertEquals(9, solution.maxTotalFruits(fruits, 5, 4));
    }

    @Test
    void testB() {
        int[][] fruits = {{0, 9}, {4, 1}, {5, 7}, {6, 2}, {7, 4}, {10, 9}};
        assertEquals(14, solution.maxTotalFruits(fruits, 5, 4));
    }

    @Test
    void testC() {
        int[][] fruits = {{0, 3}, {6, 4}, {8, 5}};
        assertEquals(0, solution.maxTotalFruits(fruits, 3, 2));
    }

}