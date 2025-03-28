package com.huhu.algorithm.learn.n825;

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
        int[] ages = {16, 16};
        assertEquals(2, solution.numFriendRequests(ages));
    }

    @Test
    void test_b() {
        int[] ages = {16, 17, 18};
        assertEquals(2, solution.numFriendRequests(ages));
    }

    @Test
    void test_c() {
        int[] ages = {20, 30, 100, 110, 120};
        assertEquals(3, solution.numFriendRequests(ages));
    }

}