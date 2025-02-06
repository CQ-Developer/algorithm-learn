package com.huhu.algorithm.learn.n30;

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
    void testA() {
        String[] words = {"foo", "bar"};
        assertIterableEquals(List.of(0, 9), solution.findSubstring("barfoothefoobarman", words));
    }

    @Test
    void testB() {
        String[] words = {"word", "good", "best", "word"};
        assertIterableEquals(List.of(), solution.findSubstring("wordgoodgoodgoodbestword", words));
    }

    @Test
    void testC() {
        String[] words = {"bar", "foo", "the"};
        assertIterableEquals(List.of(6, 9, 12), solution.findSubstring("barfoofoobarthefoobarman", words));
    }

}
