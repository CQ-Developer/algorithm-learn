package com.huhu.algorithm.learn.n2379;

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
        assertEquals(3, solution.minimumRecolors("WBBWWBBWBW", 7));
    }

    @Test
    void testB() {
        assertEquals(0, solution.minimumRecolors("WBWBBBW", 2));
    }

}
