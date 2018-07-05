package com.gri.alex;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * User: Alex
 * Date: 5-Jul-18
 */
class CanBalanceTest {

    @Test
    void test() {
        assertTrue(CanBalance.canBalance(new int[]{1, 1, 1, 2, 1}));
    }

    @Test
    void test1() {
        assertFalse(CanBalance.canBalance(new int[]{2, 1, 1, 2, 1}));
    }

    @Test
    void test2() {
        assertTrue(CanBalance.canBalance(new int[]{10, 10}));
    }

    @Test
    void test3() {
        assertFalse(CanBalance.canBalance(new int[]{2, 3, 4, 1, 2}));
    }
}
