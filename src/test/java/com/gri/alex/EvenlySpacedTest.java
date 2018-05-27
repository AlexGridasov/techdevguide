package com.gri.alex;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * User: Alex
 * Date: 27-May-18
 */
class EvenlySpacedTest {
    /*
    evenlySpaced(2, 4, 6) → true
    evenlySpaced(4, 6, 2) → true
    evenlySpaced(4, 6, 3) → false
    */

    private EvenlySpaced es;

    @BeforeEach
    void setUp() {
        es = new EvenlySpaced();
    }

    @Test
    void testEvenlySpaced() {
        assertTrue(es.evenlySpaced(2, 4, 6));
        assertTrue(es.evenlySpaced(4, 6, 2));
        assertFalse(es.evenlySpaced(4, 6, 3));
    }
}
