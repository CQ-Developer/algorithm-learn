package com.huhu.algorithm.learn.n1100;

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
        assertEquals(6, solution.numKLenSubstrNoRepeats("havefunonleetcode", 5));
    }

    @Test
    void testB() {
        assertEquals(0, solution.numKLenSubstrNoRepeats("home", 5));
    }

}