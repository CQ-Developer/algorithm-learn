package com.huhu.algorithm.learn.solution.n3413;

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
    void test_A() {
        int[][] coins = {{8, 10, 1}, {1, 3, 2}, {5, 6, 4}};
        assertEquals(10, solution.maximumCoins(coins, 4));
    }

    @Test
    void test_B() {
        int[][] coins = {{1, 10, 3}};
        assertEquals(6, solution.maximumCoins(coins, 2));
    }

}