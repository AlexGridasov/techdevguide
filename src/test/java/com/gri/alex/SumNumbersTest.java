package com.gri.alex;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * User: Alex
 * Date: 13-Jun-18
 */
class SumNumbersTest {

    @Test
    void emptyString() {
        assertEquals(0, SumNumbers.sumNumbers(""));
    }

    @Test
    void onlyChars() {
        assertEquals(0, SumNumbers.sumNumbers("Chocolate"));
    }

    @Test
    void oneNumberWithLetters() {
        assertEquals(123, SumNumbers.sumNumbers("abc123xyz"));
    }

    @Test
    void twoNumbersWithLetters() {
        assertEquals(44, SumNumbers.sumNumbers("aa11b33"));
    }

    @Test
    void twoNumbers() {
        assertEquals(18, SumNumbers.sumNumbers("7 11"));
    }

    @Test
    void oneDigit() {
        assertEquals(1, SumNumbers.sumNumbers("1"));
    }

    @Test
    void twoDigits() {
        assertEquals(12, SumNumbers.sumNumbers("12"));
    }
}