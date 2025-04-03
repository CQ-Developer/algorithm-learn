package com.huhu.algorithm.learn.solution.n2080;

class AooTest extends RangeFreqQueryTest {

    @Override
    RangeFreqQuery getRangeFreqQuery(int[] arr) {
        return new Aoo(arr);
    }

}