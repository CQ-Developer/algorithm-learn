package com.huhu.algorithm.learn.solution.n904;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

abstract class SolutionTest {

    Solution alg;

    abstract Solution getInstance();

    @BeforeEach
    void setup() {
        alg = getInstance();
    }

    @Test
    void test1() {
        int[] fruits = {1, 2, 1};
        assertEquals(3, alg.totalFruit(fruits));
    }

    @Test
    void test2() {
        int[] fruits = {0, 1, 2, 2};
        assertEquals(3, alg.totalFruit(fruits));
    }

    @Test
    void test3() {
        int[] fruits = {1, 2, 3, 2, 2};
        assertEquals(4, alg.totalFruit(fruits));
    }

    @Test
    void test4() {
        int[] fruits = {3, 3, 3, 1, 2, 1, 1, 2, 3, 3, 4};
        assertEquals(5, alg.totalFruit(fruits));
    }

}
