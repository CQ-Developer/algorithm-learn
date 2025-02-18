package com.huhu.algorithm.learn.n2555;

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
        int[] prizePositions = {1, 1, 2, 2, 3, 3, 5};
        assertEquals(7, solution.maximizeWin(prizePositions, 2));
    }

    @Test
    void testB() {
        int[] prizePositions = {1, 2, 3, 4};
        assertEquals(2, solution.maximizeWin(prizePositions, 0));
    }

}