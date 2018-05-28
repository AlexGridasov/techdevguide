package com.gri.alex;

/**
 * User: Alex
 * Date: 28-May-18
 */
public class CollapseDuplicates {

    public String collapseDuplicates(String a) {
        int i = 0;
        String result = "";

        while (i < a.length()) {
            char ch = a.charAt(i);
            result += ch;

            if (a.length() > 1) {
                while (i + 1 < a.length() && a.charAt(i + 1) == ch) {
                    i++;
                }
            }
            i++;
        }

        return result;
    }
}
