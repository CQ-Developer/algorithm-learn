package com.huhu.algorithm.learn.solution.n911;

class AooTest extends TopVotedCandidateTest {

    @Override
    TopVotedCandidate getTopVotedCandidate(int[] persons, int[] times) {
        return new Aoo(persons, times);
    }

}