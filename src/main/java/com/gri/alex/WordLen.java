package com.gri.alex;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of strings, return a Map<String, Integer> containing a key
 * for every different string in the array, and the value is that string's length.
 */
public class WordLen {

    public Map<String, Integer> wordLen(String[] strings) {
        Map<String, Integer> wordToLen = new HashMap<>();
        for (String word : strings) {
            wordToLen.computeIfAbsent(word, String::length);
        }

        return wordToLen;
    }
}
