package com.gri.alex;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * User: Alex
 * Date: 6-Jun-18
 */
class MaxSpanTest {

    @Test
    void maxSpanForEmpty() {
        assertEquals(0, MaxSpan.maxSpan(new int[]{}));
    }

    @Test
    void maxSpanForOne() {
        assertEquals(1, MaxSpan.maxSpan(new int[]{1}));
    }

    @Test
    void maxSpanForTwoTheSame() {
        assertEquals(2, MaxSpan.maxSpan(new int[]{3, 3}));
    }

    @Test
    void maxSpanForTwoDifferent() {
        assertEquals(1, MaxSpan.maxSpan(new int[]{3, 9}));
    }

    @Test
    void maxSpan() {
        assertEquals(4, MaxSpan.maxSpan(new int[]{1, 2, 1, 1, 3}));
        assertEquals(6, MaxSpan.maxSpan(new int[]{1, 4, 2, 1, 4, 1, 4}));
        assertEquals(6, MaxSpan.maxSpan(new int[]{1, 4, 2, 1, 4, 4, 4}));
    }
}