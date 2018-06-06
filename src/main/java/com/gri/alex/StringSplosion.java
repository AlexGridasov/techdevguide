package com.gri.alex;

/**
 * User: Alex
 * Date: 6-Jun-18
 */
public class StringSplosion {

    /**
     * Given a non-empty string like "Code" return a string like "CCoCodCode".
     * @param str
     * @return
     */
    public static String stringSplosion(String str) {
        StringBuilder builder = new StringBuilder();

        for (int index = 0; index <= str.length(); index++) {
            builder.append(str, 0, index);
        }

        return builder.toString();
    }
}
