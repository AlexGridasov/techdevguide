package com.gri.alex;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * User: Alex
 * Date: 6-Jun-18
 */
class StringSplosionTest {

    @Test
    void stringSplosionForOneSymbol() {
        assertEquals("a", StringSplosion.stringSplosion("a"));

    }

    @Test
    void stringSplosion() {
        assertEquals("CCoCodCode", StringSplosion.stringSplosion("Code"));
        assertEquals("aababc", StringSplosion.stringSplosion("abc"));
        assertEquals("aab", StringSplosion.stringSplosion("ab"));
    }
}