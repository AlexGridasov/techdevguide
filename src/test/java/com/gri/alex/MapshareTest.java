package com.gri.alex;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * User: Alex
 * Date: 01-Jan-19
 */
class MapshareTest {

    private Mapshare ms;

    @BeforeEach
    void setUp() {
        ms = new Mapshare();
    }

    @Test
    void shouldLeaveAandB () {
        // Given
        Map<String, String> original = Map.of(
                "a", "aaa",
                "b", "bbb",
                "c", "ccc");

        // When
        Map<String, String> modified = ms.mapShare(original);

        // Then
        assertEquals(2, modified.size());
        assertEquals("aaa", modified.get("a"));
        assertEquals("aaa", modified.get("b"));
    }

    @Test
    void shouldLeaveB () {
        // Given
        Map<String, String> original = Map.of(
                "b", "xyz",
                "c", "ccc");

        // When
        Map<String, String> modified = ms.mapShare(original);

        // Then
        assertEquals(1, modified.size());
        assertEquals("xyz", modified.get("b"));
    }

    @Test
    void shouldLeaveAandBandD () {
        // Given
        Map<String, String> original = Map.of(
                "a", "aaa",
                "c", "meh",
                "d", "hi");

        // When
        Map<String, String> modified = ms.mapShare(original);

        // Then
        assertEquals(3, modified.size());
        assertEquals("aaa", modified.get("a"));
        assertEquals("aaa", modified.get("b"));
        assertEquals("hi", modified.get("d"));
    }
}
