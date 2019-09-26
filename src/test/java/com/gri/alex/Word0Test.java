package com.gri.alex;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasEntry;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Word0Test {

    @Test
    void word0() {
        // Given
        Word0 word0 = new Word0();
        String[] inputArray = {"a", "b", "a", "b"};
        Map<String, Integer> expectedMap  = new HashMap<>() {{
            put("a", 0);
            put( "b", 0);
        }};

        // When
        Map<String, Integer> actualMap = word0.word0(inputArray);

        // Then
        assertTrue(actualMap.equals(expectedMap));
        assertThat(actualMap, hasEntry("a", 0));
        assertThat(actualMap, hasEntry("b", 0));
    }
}
