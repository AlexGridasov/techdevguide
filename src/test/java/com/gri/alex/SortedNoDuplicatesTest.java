package com.gri.alex;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * User: Alex
 * Date: 02-Jan-19
 */
class SortedNoDuplicatesTest {

    private SortedNoDuplicates snd;

    @BeforeEach
    void setUp() {
        snd = new SortedNoDuplicates();
    }

    @Test
    void shouldReturnEmpty() {
        // sort([]) → []
        // Given
        int[] original = {};

        // When
        int[] sorted = snd.sort(original);

        // Then
        assertEquals(0, sorted.length);
    }

    @Test
    void shouldReturnTheSame() {
        // sort([1]) → [1]
        // Given
        int[] original = {1};

        // When
        int[] sorted = snd.sort(original);

        // Then
        assertEquals(1, sorted.length);
        assertEquals(1, sorted[0]);
    }

    @Test
    void shouldReturnWithoutDuplicates() {
        // sort([1, 1]) → [1]
        // Given
        int[] original = {1, 1};

        // When
        int[] sorted = snd.sort(original);

        // Then
        assertEquals(1, sorted.length);
        assertEquals(1, sorted[0]);
    }

}
