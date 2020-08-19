package com.thoughtworks.basic;

import java.util.Arrays;

class StringCalculator {

    int add(String string) {
        String NUMBER_SEPARATOR = ",";
        String LINE_SEPARATOR = "\n";
        String separators = "[" + NUMBER_SEPARATOR + LINE_SEPARATOR + "]";

        if (string.isEmpty()) {
            return 0;
        }

        if (string.length() == 1) {
            return parseToInt(string);
        }

        return Arrays.stream(splitBySeparators(string, separators))
                .mapToInt(this::parseToInt)
                .sum();
    }

    private String[] splitBySeparators(String string, String separators) {
        return string.split(separators);
    }

    private int parseToInt(String string) {
        return Integer.parseInt(string);
    }
}
