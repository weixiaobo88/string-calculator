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

    @Test
    public void should_return_the_number_when_calculate_given_one_number() {
        //given
        StringCalculator stringCalculator = new StringCalculator();

        //when
        int result = stringCalculator.add("1");

        //then
        assertEquals(1, result);
    }

    @Test
    public void should_return_the_sum_when_calculate_given_two_numbers() {
        //given
        StringCalculator stringCalculator = new StringCalculator();

        //when
        int result = stringCalculator.add("1,2");

        //then
        assertEquals(3, result);
    }
}
