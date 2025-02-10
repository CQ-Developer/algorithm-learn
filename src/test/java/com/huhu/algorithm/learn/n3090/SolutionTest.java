package com.huhu.algorithm.learn.n3090;

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
        assertEquals(4, solution.maximumLengthSubstring("bcbbbcba"));
    }

    @Test
    void testB() {
        assertEquals(2, solution.maximumLengthSubstring("aaaa"));
    }

}
