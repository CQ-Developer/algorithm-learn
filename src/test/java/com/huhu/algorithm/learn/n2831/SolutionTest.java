package com.huhu.algorithm.learn.n2831;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

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
        assertEquals(3, solution.longestEqualSubarray(List.of(1, 3, 2, 3, 1, 3), 3));
    }

    @Test
    void testB() {
        assertEquals(4, solution.longestEqualSubarray(List.of(1, 1, 2, 2, 1, 1), 2));
    }

    @Test
    void testC() {
        assertEquals(1, solution.longestEqualSubarray(List.of(1), 0));
    }

    @Test
    void testD() {
        assertEquals(2, solution.longestEqualSubarray(List.of(4, 4, 2, 2, 4), 1));
    }

}