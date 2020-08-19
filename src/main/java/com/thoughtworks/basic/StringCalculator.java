package com.thoughtworks.basic;

import java.util.Arrays;

class StringCalculator {

    int add(String string) {
        String NUMBER_SEPARATOR = ",";

        if (string.isEmpty()) {
            return 0;
        }

        if (string.length() == 1) {
            return parseToInt(string);
        }

        return Arrays.stream(string.split(NUMBER_SEPARATOR))
                .mapToInt(this::parseToInt)
                .sum();
    }

    private int parseToInt(String string) {
        return Integer.parseInt(string);
    }
}
