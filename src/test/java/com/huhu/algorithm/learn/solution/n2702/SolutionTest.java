package com.huhu.algorithm.learn.solution.n2702;

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
        assertEquals(3, solution.minOperations(new int[]{3, 4, 1, 7, 6}, 4, 2));
    }

    @Test
    void test_b() {
        assertEquals(1, solution.minOperations(new int[]{1, 2, 1}, 2, 1));
    }

}