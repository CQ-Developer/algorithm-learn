package com.huhu.algorithm.learn.solution.n1040;

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
    void test_A() {
        int[] stones = {7, 4, 9};
        assertArrayEquals(new int[]{1, 2}, solution.numMovesStonesII(stones));
    }

    @Test
    void test_B() {
        int[] stones = {6, 5, 4, 3, 10};
        assertArrayEquals(new int[]{2, 3}, solution.numMovesStonesII(stones));
    }

}