package com.gri.alex;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * User: Alex
 * Date: 28-May-18
 */
class MakeBricksTest {

    private MakeBricks mb;

    @BeforeEach
    void setUp() {
        mb = new MakeBricks();
    }

    @Test
    void notEnoughBricks () {
        assertFalse(mb.makeBricks(1, 1, 10));
    }

    @Test
    void useOnlyBig () {
        assertTrue(mb.makeBricks(0, 1, 5));
    }

    @Test
    void notEnoughSmallBricks () {
        assertFalse(mb.makeBricks(2, 2, 8));
    }

    @Test
    void testFewCases () {
        assertTrue(mb.makeBricks(3, 1, 8));
        assertFalse(mb.makeBricks(3, 1, 9));
        assertTrue(mb.makeBricks(3, 2, 10));
    }
}
