package com.huhu.algorithm.learn.n1016;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

abstract class SolutionTest {

    Solution solution;

    abstract Solution getInstance();

    @BeforeEach
    void setup() {
        solution = getInstance();
    }

    @Test
    void testA() {
        assertTrue(solution.queryString("0110", 3));
    }

    @Test
    void testB() {
        assertFalse(solution.queryString("0110", 4));
    }

}