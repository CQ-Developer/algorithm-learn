package com.huhu.algorithm.learn.n2730;

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
        assertEquals(4, solution.longestSemiRepetitiveSubstring("52233"));
    }

    @Test
    void testB() {
        assertEquals(4, solution.longestSemiRepetitiveSubstring("5494"));
    }

    @Test
    void testC() {
        assertEquals(2, solution.longestSemiRepetitiveSubstring("1111111"));
    }

    @Test
    void testD() {
        assertEquals(3, solution.longestSemiRepetitiveSubstring("0001"));
    }

}
