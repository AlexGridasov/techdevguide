package com.gri.alex;

/*
Given 2 int values greater than 0, return whichever value is nearest to 21 without going over.
Return 0 if they both go over.

blackjack(19, 21) → 21
blackjack(21, 19) → 21
blackjack(19, 22) → 19
 */

/**
 * User: Alex
 * Date: 20-May-18
 */
public class BlackjackProblem {

    public static final int BLACK_JACK = 21;

    public int blackjack(int a, int b) {
        if ((a > BLACK_JACK && b > BLACK_JACK) || (a == BLACK_JACK && b == BLACK_JACK)) {
            // bothPlayersGreaterThanOrEqual21Loose
            return 0;
        } else if (a == BLACK_JACK) {
            // playerWith21ShouldWin_ifOtherDoesNotHave21
            return a;
        } else if (b == BLACK_JACK) {
            return b;
        } else if (a > BLACK_JACK && (b <= BLACK_JACK)) {
            // playerGreater21ShouldLoose_ifAnotherEqualOrLessThan21
            return  b;
        } else if (b > BLACK_JACK && (a <= BLACK_JACK)) {
            return a;
        } else {
            return Math.max(a, b);
        }
    }

}
