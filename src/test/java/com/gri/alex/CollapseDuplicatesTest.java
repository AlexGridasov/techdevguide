package com.gri.alex;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * User: Alex
 * Date: 28-May-18
 */
class CollapseDuplicatesTest {
    /*
    collapseDuplicates("a") → "a"
    collapseDuplicates("aa") → "a"
    collapseDuplicates("abc") → "abc"
    */

    private CollapseDuplicates cd;

    @BeforeEach
    void setUp() {
        cd = new CollapseDuplicates();
    }

    @Test
    void shouldReturnTheSameSymbol() {
        assertEquals("a", cd.collapseDuplicates("a"));
    }

    @Test
    void collapseDuplicates() {
        assertEquals("a", cd.collapseDuplicates("aa"));

        assertEquals("abca", cd.collapseDuplicates("abbbcaaa"));

        assertEquals("abcac", cd.collapseDuplicates("abbbcaaaccc"));
    }

    @Test
    void shouldReturnTheSameString() {
        assertEquals("abc", cd.collapseDuplicates("abc"));
    }
}
