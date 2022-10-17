package ru.bamlukanov.leetcodealgo;

import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    @ParameterizedTest
    @MethodSource("provideArguments")
    void searchTest(List<Integer> array, int target, int expected) {
        var search = new BinarySearch();
        assertEquals(expected, search.search(array.stream().mapToInt(value -> value).toArray(), target));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(List.of(-1, 0, 3, 5, 9, 12), 9, 4),
                Arguments.of(List.of(-1, 0, 3, 5, 9, 12), 2, -1),
                Arguments.of(List.of(-1, 0, 3, 5, 9, 12), 0, 1),
                Arguments.of(List.of(12), 12, 0),
                Arguments.of(Collections.emptyList(), 10, -1)
        );
    }

}