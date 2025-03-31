package com.huhu.algorithm.learn.lcp.n68;

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
    void test_a() {
        int[] flowers = {1, 2, 3, 2};
        assertEquals(8, solution.beautifulBouquet(flowers, 1));
    }

    @Test
    void test_b() {
        int[] flowers = {5, 3, 3, 3};
        assertEquals(8, solution.beautifulBouquet(flowers, 2));
    }

}