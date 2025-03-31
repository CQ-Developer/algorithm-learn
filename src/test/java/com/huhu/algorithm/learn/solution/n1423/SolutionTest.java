package com.huhu.algorithm.learn.solution.n1423;

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
        int[] cardPoints = {1, 2, 3, 4, 5, 6, 1};
        assertEquals(12, solution.maxScore(cardPoints, 3));
    }

    @Test
    void testB() {
        int[] cardPoints = {2, 2, 2};
        assertEquals(4, solution.maxScore(cardPoints, 2));
    }

    @Test
    void testC() {
        int[] cardPoints = {9, 7, 7, 9, 7, 7, 9};
        assertEquals(55, solution.maxScore(cardPoints, 7));
    }

    @Test
    void testD() {
        int[] cardPoints = {1, 1000, 1};
        assertEquals(1, solution.maxScore(cardPoints, 1));
    }

    @Test
    void testE() {
        int[] cardPoints = {1, 79, 80, 1, 1, 1, 200, 1};
        assertEquals(202, solution.maxScore(cardPoints, 3));
    }

}