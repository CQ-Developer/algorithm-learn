package com.huhu.algorithm.learn.solution.n1208;

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
        assertEquals(3, solution.equalSubstring("abcd", "bcdf", 3));
    }

    @Test
    void testB() {
        assertEquals(1, solution.equalSubstring("abcd", "cdef", 3));
    }

    @Test
    void testC() {
        assertEquals(1, solution.equalSubstring("abcd", "acde", 0));
    }

}
