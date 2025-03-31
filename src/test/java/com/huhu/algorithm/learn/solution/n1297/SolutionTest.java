package com.huhu.algorithm.learn.solution.n1297;

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
        assertEquals(2, solution.maxFreq("aababcaab", 2, 3, 4));
    }

    @Test
    void testB() {
        assertEquals(2, solution.maxFreq("aaaa", 1, 3, 3));
    }

    @Test
    void testC() {
        assertEquals(3, solution.maxFreq("aabcabcab", 2, 2, 3));
    }

    @Test
    void testD() {
        assertEquals(0, solution.maxFreq("abcde", 2, 3, 3));
    }

}
