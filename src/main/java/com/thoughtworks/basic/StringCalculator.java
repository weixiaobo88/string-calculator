package com.thoughtworks.basic;

import java.util.Arrays;

class StringCalculator {
    private static final String PREFIX_OF_CHANGE_SEPARATOR = "//";

    int add(String string) {
        String NUMBER_SEPARATOR = ",";
        String LINE_SEPARATOR = "\n";
        String separators = "[" + NUMBER_SEPARATOR + LINE_SEPARATOR + "]";
        String[] splitString;

        if (string.isEmpty()) {
            return 0;
        }

        if (string.length() == 1) {
            return parseToInt(string);
        }

        if (string.startsWith(PREFIX_OF_CHANGE_SEPARATOR)) {
            int separatorBeginIndex = 2;
            int separatorEndIndex = 3;
            int validStringBeginIndex = 4;
            String separator = string.substring(separatorBeginIndex, separatorEndIndex);
            splitString = splitBySeparators(string.substring(validStringBeginIndex), separator);
        } else {
            splitString = splitBySeparators(string, separators);
        }

        return Arrays.stream(splitString)
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
