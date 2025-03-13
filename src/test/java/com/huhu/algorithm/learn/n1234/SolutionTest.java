package com.huhu.algorithm.learn.n1234;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

abstract class SolutionTest {

    Solution solution;

    abstract Solution getSolution();

    @BeforeEach
    void setup() {
        solution = getSolution();
    }

    @Test
    void test_a() {
        Assertions.assertEquals(0, solution.balancedString("QWER"));
    }

    @Test
    void test_b() {
        Assertions.assertEquals(1, solution.balancedString("QQWE"));
    }

    @Test
    void test_c() {
        Assertions.assertEquals(2, solution.balancedString("QQQW"));
    }

}