package com.gri.alex;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * User: Alex
 * Date: 20-May-18
 */
class BlackjackProblemTest {

    /*
    blackjack(19, 22) → 19

    blackjack(22, 22) → 0
    blackjack(21, [15,25]) → 21
    blackjack([15,25], 21) → 21

    blackjack(25, 20) → 20
    blackjack(20, 25) → 20

    blackjack(19, 21) → 21
    blackjack(21, 19) → 21
    */

    private BlackjackProblem bj;

    @BeforeEach
    void setUp() {
        bj = new BlackjackProblem();
    }

    @Test
    void bothPlayersGreaterThanOrEqual21Loose() {
        // a = 21, b = 21
        assertEquals(0, bj.blackjack(21, 21));
        // a > 21, b > 21
        assertEquals(0, bj.blackjack(22, 22));
    }

    @Test
    void playerWith21ShouldWin_ifOtherDoesNotHave21() {
        // a <= 21, >=21; b = 21
        assertEquals(21, bj.blackjack(19, 21));
        // a = 21, b <= 21, >= 21
        assertEquals(21, bj.blackjack(21, 19));
    }

    @Test
    void playerGreater21ShouldLoose_ifAnotherEqualOrLessThan21() {
        // a <= 21, >=21; b = 21
        assertEquals(21, bj.blackjack(19, 21));
        // a = 21, b <= 21, >= 21
        assertEquals(21, bj.blackjack(21, 19));
    }

    @Test
    void playerCloserTo21ShouldWin() {
        // a < 21, b < 21
        assertEquals(19, bj.blackjack(19, 15));
        assertEquals(19, bj.blackjack(15, 19));
    }
}
