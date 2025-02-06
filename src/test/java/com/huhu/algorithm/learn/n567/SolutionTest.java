package com.huhu.algorithm.learn.n567;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

abstract class SolutionTest {

    Solution solution;

    abstract Solution getSolution();

    @BeforeEach
    void setup() {
        solution = getSolution();
    }

    @Test
    void testA() {
        assertTrue(solution.checkInclusion("ab", "eidbaooo"));
    }

    @Test
    void testB() {
        assertFalse(solution.checkInclusion("ab", "eidboaoo"));
    }

}
