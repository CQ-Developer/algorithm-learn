package com.huhu.algorithm.learn.n2269;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

abstract class SolutionTest {

    Solution solution;

    abstract Solution getInstance();

    @BeforeEach
    void setup() {
        solution = getInstance();
    }

    @Test
    void testA() {
        assertEquals(2, solution.divisorSubstrings(240, 2));
    }

    @Test
    void testB() {
        assertEquals(2, solution.divisorSubstrings(430043, 2));
    }

}