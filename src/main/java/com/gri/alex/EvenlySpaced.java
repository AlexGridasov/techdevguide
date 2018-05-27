package com.gri.alex;

/*
Given three ints, a b c, one of them is small, one is medium and one is large.
Return true if the three values are evenly spaced, so the difference between
small and medium is the same as the difference between medium and large.

evenlySpaced(2, 4, 6) → true
evenlySpaced(4, 6, 2) → true
evenlySpaced(4, 6, 3) → false
*/

import java.util.Arrays;

/**
 * User: Alex
 * Date: 27-May-18
 */
public class EvenlySpaced {

    public boolean evenlySpaced(int a, int b, int c) {
        int[] numbers = {a, b, c};
        Arrays.sort(numbers);

        return (numbers[1] - numbers[0]) == (numbers[2] - numbers[1]);
    }
}
