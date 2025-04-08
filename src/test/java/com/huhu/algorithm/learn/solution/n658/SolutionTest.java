package com.huhu.algorithm.learn.solution.n658;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

abstract class SolutionTest {

    Solution solution;

    abstract Solution getSolution();

    @BeforeEach
    void setup() {
        solution = getSolution();
    }

    @Test
    void test_a() {
        assertIterableEquals(List.of(1, 2, 3, 4), solution.findClosestElements(new int[]{1, 2, 3, 4, 5}, 4, 3));
    }

    @Test
    void test_b() {
        assertIterableEquals(List.of(1, 1, 2, 3), solution.findClosestElements(new int[]{1, 1, 2, 3, 4, 5}, 4, -1));
    }

}