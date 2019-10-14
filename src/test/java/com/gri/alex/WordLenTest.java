package com.gri.alex;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

class WordLenTest {

    @Test
    void wordLenTwoRepeated() {
        //Given
        WordLen wordLen = new WordLen();
        String[] inputArray = {"a", "bb", "a", "bb"};
        Map<String, Integer> expectedMap = new HashMap<>();
        expectedMap.put("bb", 2);
        expectedMap.put("a", 1);

        //When
        Map<String, Integer> actualMap = wordLen.wordLen(inputArray);

        //Then
        assertThat(actualMap.size(), is(2));
        assertThat(actualMap, is(expectedMap));
    }

    @Test
    void wordLen() {
        //Given
        WordLen wordLen = new WordLen();
        String[] inputArray = {"this", "and", "that", "and"};
        Map<String, Integer> expectedMap = new HashMap<>();
        expectedMap.put("that", 4);
        expectedMap.put("and", 3);
        expectedMap.put("this", 4);

        //When
        Map<String, Integer> actualMap = wordLen.wordLen(inputArray);

        //Then
        assertThat(actualMap.size(), is(3));
        assertThat(actualMap, is(expectedMap));
    }

    @Test
    void wordLenThreeRepeated() {
        //Given
        WordLen wordLen = new WordLen();
        String[] inputArray = {"code", "code", "code", "bug"};
        Map<String, Integer> expectedMap = new HashMap<>();
        expectedMap.put("code", 4);
        expectedMap.put("bug", 3);

        //When
        Map<String, Integer> actualMap = wordLen.wordLen(inputArray);

        //Then
        assertThat(actualMap.size(), is(2));
        assertThat(actualMap, is(expectedMap));
    }
}
