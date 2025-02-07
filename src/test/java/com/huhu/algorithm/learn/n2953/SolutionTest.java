package com.huhu.algorithm.learn.n2953;

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
        assertEquals(3, solution.countCompleteSubstrings("igigee", 2));
    }

    @Test
    void testB() {
        assertEquals(6, solution.countCompleteSubstrings("aaabbbccc", 3));
    }

}