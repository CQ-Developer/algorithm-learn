package com.huhu.algorithm.learn.solution.n340;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.HashMap;
import java.util.random.RandomGenerator;
import java.util.random.RandomGeneratorFactory;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

abstract class SolutionTest {

    static RandomGenerator generator;

    @BeforeAll
    static void init() {
        generator = RandomGeneratorFactory.of("SecureRandom").create(System.nanoTime());
    }

    static int check(String s, int k) {
        var cnt = new HashMap<Character, Integer>();
        int l = 0;
        char[] cs = s.toCharArray();
        for (char c : cs) {
            cnt.merge(c, 1, Integer::sum);
            if (cnt.size() > k) {
                if (cnt.merge(cs[l], -1, Integer::sum) == 0) {
                    cnt.remove(cs[l]);
                }
                ++l;
            }
        }
        return cs.length - l;
    }

    static Stream<Arguments> arguments() {
        return Stream.iterate(0, i -> i < 100, i -> i + 1)
                .map(SolutionTest::arguments);
    }

    static Arguments arguments(int i) {
        var s = generator.ints(generator.nextInt(1, 50001), 'a', 'z' + 1)
                .mapToObj(Character::toString)
                .collect(Collectors.joining());
        int k = generator.nextInt(51);
        return Arguments.arguments(s, k);
    }

    Solution solution;

    abstract Solution getSolution();

    @BeforeEach
    void setup() {
        solution = getSolution();
    }

    @Test
    void test_a() {
        assertEquals(3, solution.lengthOfLongestSubstringKDistinct("eceba", 2));
    }

    @Test
    void test_b() {
        assertEquals(2, solution.lengthOfLongestSubstringKDistinct("aa", 1));
    }

    @ParameterizedTest
    @MethodSource("arguments")
    void test_c(String s, int k) {
        assertEquals(check(s, k), solution.lengthOfLongestSubstringKDistinct(s, k));
    }

}