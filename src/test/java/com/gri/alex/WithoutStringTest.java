package com.gri.alex;

import org.junit.jupiter.api.Test;

import static com.gri.alex.WithoutString.withoutString;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * User: Alex
 * Date: 7-Jun-18
 */
class WithoutStringTest {

    @Test
    void emptyString() {
        assertEquals("", withoutString("", "x"));
    }

    @Test
    void removeAllString() {
        assertEquals("", withoutString("1111", "1"));
        assertEquals("", withoutString("1111", "11"));
        assertEquals("", withoutString("xxx", "x"));
    }

    @Test
    void removeNothing() {
        assertEquals("Hello there", withoutString("Hello there", "x"));
    }

    @Test
    void removeNotCaseSensitive() {
        assertEquals("Th  a FH", withoutString("This is a FISH", "IS"));
        assertEquals("TH  a FH", withoutString("THIS is a FISH", "is"));
        assertEquals("TH  a FH", withoutString("THIS is a FISH", "iS"));
    }

    @Test
    void removeAll() {
        assertEquals("abab", withoutString("abxxxxab", "xx"));
    }

    @Test
    void removeAllExceptOne() {
        assertEquals("abxab", withoutString("abxxxab", "xx"));
        assertEquals("x", withoutString("xxx", "xx"));
    }
}