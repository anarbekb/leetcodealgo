package ru.bamlukanov.leetcodealgo.searchinsertposition;

import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class SearchInsertPositionTest {
    @ParameterizedTest
    @MethodSource("provideArguments")
    void searchInsertPositionTest(List<Integer> nums, int target, int expected) {
        var search = new SearchInsertPosition();
        assertEquals(expected, search.searchInsert(nums.stream().mapToInt(value -> value).toArray(), target));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(List.of(1, 3, 5, 6), 5, 2),
                Arguments.of(List.of(1, 3, 5, 6), 2, 1),
                Arguments.of(List.of(1, 3, 5, 6), 7, 4),
                Arguments.of(List.of(1, 3), 2, 1)
        );
    }
}