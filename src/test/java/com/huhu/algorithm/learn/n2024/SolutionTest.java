package com.huhu.algorithm.learn.n2024;

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
        assertEquals(4, solution.maxConsecutiveAnswers("TTFF", 2));
    }

    @Test
    void testB() {
        assertEquals(3, solution.maxConsecutiveAnswers("TFFT", 1));
    }

    @Test
    void testC() {
        assertEquals(5, solution.maxConsecutiveAnswers("TTFTTFTT", 1));
    }

}
