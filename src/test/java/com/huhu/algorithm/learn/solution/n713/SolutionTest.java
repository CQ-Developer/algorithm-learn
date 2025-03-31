package com.huhu.algorithm.learn.solution.n713;

import com.huhu.algorithm.common.BatchSpliterator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.platform.commons.util.ClassLoaderUtils;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

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
        int[] nums = {10, 5, 2, 6};
        assertEquals(8, solution.numSubarrayProductLessThanK(nums, 100));
    }

    @Test
    void test_b() {
        int[] nums = {1, 2, 3};
        assertEquals(0, solution.numSubarrayProductLessThanK(nums, 0));
    }

    @ParameterizedTest
    @MethodSource("generate")
    void test_c(int[] nums, int k, int expected) {
        assertEquals(expected, solution.numSubarrayProductLessThanK(nums, k));
    }

    static Stream<Arguments> generate() throws Exception {
        var url = ClassLoaderUtils.getDefaultClassLoader().getResource("n713.cases");
        if (url == null) {
            return Stream.empty();
        }
        return StreamSupport.stream(
                        new BatchSpliterator<>(3, Files.lines(Paths.get(url.toURI())).spliterator()), false)
                .flatMap(SolutionTest::generate);
    }

    static Stream<Arguments> generate(List<String> batch) {
        int[] nums = Stream.of(batch.get(0).split(",")).mapToInt(Integer::parseInt).toArray();
        int k = Integer.parseInt(batch.get(1));
        int res = Integer.parseInt(batch.get(2));
        return Stream.of(Arguments.arguments(nums, k, res));
    }

}