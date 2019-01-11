package com.gri.alex;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

class SimpleIinterpreterTest {
    private SimpleIinterpreter simpleIinterpreter;

    @BeforeEach
    void setUp() {
        simpleIinterpreter = new SimpleIinterpreter();
    }

    @Test
    void shouldInterpretOneCommand() {
        // Given

        // When
        int plus = simpleIinterpreter.interpret(1, new String[]{"+"}, new int[]{1});
        int minus = simpleIinterpreter.interpret(1, new String[]{"-"}, new int[]{1});
        int multiply = simpleIinterpreter.interpret(1, new String[]{"*"}, new int[]{1});

        // Then
        assertThat(plus, equalTo(2));
        assertThat(minus, equalTo(0));
        assertThat(multiply, equalTo(1));
    }

    @Test
    void shouldHandleUnknownCommand() {
        // Given

        // When
        int result = simpleIinterpreter.interpret(1, new String[]{"/"}, new int[]{1});

        // Then
        assertThat(result, equalTo(-1));

    }

}
