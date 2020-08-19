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

    @Test
    public void should_return_the_sum_when_calculate_given_any_amount_numbers() {
        //given
        StringCalculator stringCalculator = new StringCalculator();

        //when
        int result = stringCalculator.add("1,2,3");

        //then
        assertEquals(6, result);
    }

    @Test
    public void should_return_the_sum_when_calculate_given_any_amount_numbers_with_new_line_or_comma_as_separator() {
        //given
        StringCalculator stringCalculator = new StringCalculator();

        //when
        int result = stringCalculator.add("1\n2,3");

        //then
        assertEquals(6, result);
    }

    @Test
    public void should_return_the_sum_when_calculate_given_the_separator_in_first_line_and_numbers() {
        //given
        StringCalculator stringCalculator = new StringCalculator();

        //when
        int result = stringCalculator.add("//;\n1;2");

        //then
        assertEquals(3, result);
    }
}
