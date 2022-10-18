package ru.bamlukanov.leetcodealgo.firstbadversion;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class FirstBadVersionTest {

    @ParameterizedTest
    @MethodSource("provideArguments")
    void badVersionTest(int n, int firstBadVersion) {
        var versionControl = Mockito.mock(VersionControl.class);
        Mockito.when(versionControl.isBadVersion(firstBadVersion)).thenReturn(true);
        var badVersion = new FirstBadVersion(versionControl);

        assertEquals(firstBadVersion, badVersion.firstBadVersion(n));
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(5, 4),
                Arguments.of(1, 1)
        );
    }
}