package com.gri.alex;

/**
 * User: Alex
 * Date: 13-Jun-18
 */
public class SumNumbers {

    public static final String SPACE_SYMBOL = " ";

    /**
     * Given a string, return the sum of the numbers appearing in the string,
     * ignoring all other characters. A number is a series of 1 or more digit chars in a row.
     * (Note: Character.isDigit(char) tests if a char is one of the chars '0', '1', .. '9'.
     * Integer.parseInt(string) converts a string to an int.)
     * @param str string
     * @return sum of the numbers appearing in the string
     */
    public static int sumNumbers(String str) {
        int len = str.length();
        int sum = 0;

        if (len > 0) {
            str = str.replaceAll("[^0-9]+", SPACE_SYMBOL);
            if (!str.equals(SPACE_SYMBOL)) {
                String[] strings = str.trim().split(SPACE_SYMBOL);

                for (String strNum : strings) {
                    sum += Integer.parseInt(strNum);
                }
            }
        }

        return sum;
    }
}
