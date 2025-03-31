package com.huhu.algorithm.learn.solution.n2516;

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
        assertEquals(8, solution.takeCharacters("aabaaaacaabc", 2));
    }

    @Test
    void testB() {
        assertEquals(-1, solution.takeCharacters("a", 1));
    }

    @Test
    void testC() {
        assertEquals(3, solution.takeCharacters("abc", 1));
    }

}