package com.huhu.algorithm.learn.solution.n1888;

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
        assertEquals(2, solution.minFlips("111000"));
    }

    @Test
    void testB() {
        assertEquals(0, solution.minFlips("010"));
    }

    @Test
    void testC() {
        assertEquals(1, solution.minFlips("1110"));
    }

}
