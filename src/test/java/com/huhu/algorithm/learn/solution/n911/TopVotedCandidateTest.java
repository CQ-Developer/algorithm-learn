package com.huhu.algorithm.learn.solution.n911;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

abstract class TopVotedCandidateTest {

    abstract TopVotedCandidate getTopVotedCandidate(int[] persons, int[] times);

    @Test
    void test_a() {
        var solution = getTopVotedCandidate(
                new int[]{0, 1, 1, 0, 0, 1, 0}, new int[]{0, 5, 10, 15, 20, 25, 30});
        assertEquals(0, solution.q(3));
        assertEquals(1, solution.q(12));
        assertEquals(1, solution.q(25));
        assertEquals(0, solution.q(15));
        assertEquals(0, solution.q(24));
        assertEquals(1, solution.q(8));
    }

}