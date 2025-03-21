package com.huhu.algorithm.learn.n2799;

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
        int[] nums = {1, 3, 1, 2, 2};
        assertEquals(4, solution.countCompleteSubarray(nums));
    }

    @Test
    void test_b() {
        int[] nums = {5, 5, 5, 5};
        assertEquals(10, solution.countCompleteSubarray(nums));
    }

    @ParameterizedTest
    @MethodSource("generate")
    void test_e(int[] nums, int expected) {
        assertEquals(expected, solution.countCompleteSubarray(nums));
    }

    static Stream<Arguments> generate() throws Exception {
        var url = ClassLoaderUtils.getDefaultClassLoader().getResource("n2799.cases");
        if (url == null) {
            return Stream.empty();
        }
        return StreamSupport.stream(
                        new BatchSpliterator<>(2, Files.lines(Paths.get(url.toURI())).spliterator()), false)
                .flatMap(SolutionTest::generate);
    }

    static Stream<Arguments> generate(List<String> part) {
        if (part.size() != 2) {
            return Stream.empty();
        }
        int[] nums = Stream.of(part.get(0).trim().split(","))
                .mapToInt(Integer::parseInt)
                .toArray();
        int expected = Integer.parseInt(part.get(1));
        return Stream.of(Arguments.arguments(nums, expected));
    }

}