package com.huhu.algorithm.learn.solution.n2594;

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
        assertEquals(16, solution.repairCars(new int[]{4, 2, 3, 1}, 10));
    }

    @Test
    void test_b() {
        assertEquals(16, solution.repairCars(new int[]{5, 1, 8}, 6));
    }

}