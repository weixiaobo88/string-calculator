package com.thoughtworks.basic;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringCalculatorTest {
    @Test
    public void should_return_0_when_calculate_given_empty_string() {
        //given
        StringCalculator stringCalculator = new StringCalculator();

        //when
        int result = stringCalculator.add("");

        //then
        assertEquals(0, result);
    }
}
