package com.huhu.algorithm.learn.n1461;

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
        assertTrue(solution.hasAllCodes("00110110", 2));
    }

    @Test
    void testB() {
        assertTrue(solution.hasAllCodes("0110", 1));
    }

    @Test
    void testC() {
        assertFalse(solution.hasAllCodes("0110", 2));
    }

    @Test
    void testD() {
        assertFalse(solution.hasAllCodes("0", 20));
    }

    @Test
    void testE() {
        assertTrue(solution.hasAllCodes("1010001011000000001010010111011011100110000011101111110100010111011001111000010011010010011111110101001111001101000001011100010110011010101010000011000111100011", 5));
    }

}
