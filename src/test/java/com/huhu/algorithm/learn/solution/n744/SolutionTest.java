package com.huhu.algorithm.learn.solution.n744;

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
        char[] letters = {'c', 'f', 'j'};
        assertEquals('c', solution.nextGreatestLetter(letters, 'a'));
    }

    @Test
    void test_b() {
        char[] letters = {'c', 'f', 'j'};
        assertEquals('f', solution.nextGreatestLetter(letters, 'c'));
    }

    @Test
    void test_c() {
        char[] letters = {'x', 'x', 'y', 'y'};
        assertEquals('x', solution.nextGreatestLetter(letters, 'z'));
    }

    @Test
    void test_d() {
        char[] letters = {'c', 'f', 'j'};
        assertEquals('f', solution.nextGreatestLetter(letters, 'd'));
    }

    @Test
    void test_e() {
        char[] letters = {'c', 'f', 'j'};
        assertEquals('j', solution.nextGreatestLetter(letters, 'g'));
    }

}