package com.gri.alex;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

class SimpleInterpreterTest {
    private SimpleInterpreter simpleInterpreter;

    @BeforeEach
    void setUp() {
        simpleInterpreter = new SimpleInterpreter();
    }

    @Test
    void shouldInterpretOneCommand() {
        // Given

        // When
        int plus = simpleInterpreter.interpret(1, new String[]{"+"}, new int[]{1});
        int minus = simpleInterpreter.interpret(1, new String[]{"-"}, new int[]{1});
        int multiply = simpleInterpreter.interpret(1, new String[]{"*"}, new int[]{1});

        // Then
        assertThat(plus, equalTo(2));
        assertThat(minus, equalTo(0));
        assertThat(multiply, equalTo(1));
    }

    @Test
    void shouldHandleUnknownCommand() {
        // Given

        // When
        int result = simpleInterpreter.interpret(1, new String[]{"/"}, new int[]{1});

        // Then
        assertThat(result, equalTo(-1));
    }

    @Test
    void shouldInterpretTwoCommands() {
        // Given

        // When
        int result = simpleInterpreter.interpret(1, new String[]{"+", "*"}, new int[]{1, 3});

        // Then
        assertThat(result, equalTo(6));
    }

}
