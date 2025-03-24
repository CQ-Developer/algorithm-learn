package com.huhu.algorithm.learn.n2743;

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
import static org.junit.jupiter.params.provider.Arguments.arguments;

abstract class SolutionTest {

    Solution solution;

    abstract Solution getSolution();

    @BeforeEach
    void setup() {
        solution = getSolution();
    }

    @Test
    void test_a() {
        assertEquals(10, solution.numberOfSpecialSubstrings("abcd"));
    }

    @Test
    void test_b() {
        assertEquals(3, solution.numberOfSpecialSubstrings("ooo"));
    }

    @Test
    void test_c() {
        assertEquals(7, solution.numberOfSpecialSubstrings("abab"));
    }

    @ParameterizedTest
    @MethodSource("generate")
    void test_d(String s, int expected) {
        assertEquals(expected, solution.numberOfSpecialSubstrings(s));
    }

    static Stream<Arguments> generate() throws Exception {
        var input = ClassLoaderUtils.getDefaultClassLoader().getResource("n2743.cases");
        if (input == null) {
            return Stream.empty();
        }
        return StreamSupport.stream(
                        new BatchSpliterator<>(2, Files.lines(Paths.get(input.toURI())).spliterator()),
                        false)
                .flatMap(SolutionTest::generate);
    }

    static Stream<Arguments> generate(List<String> list) {
        if (list.size() != 2) {
            return Stream.empty();
        }
        var s = list.get(0);
        int expected = Integer.parseInt(list.get(1));
        return Stream.of(arguments(s, expected));
    }

}