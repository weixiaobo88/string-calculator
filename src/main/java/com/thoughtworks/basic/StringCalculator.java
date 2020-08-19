package com.thoughtworks.basic;

import java.util.Arrays;

class StringCalculator {
    private static final String PREFIX_OF_CHANGE_SEPARATOR = "//";

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

        return Arrays.stream(generateSplitStrings(string, separators))
                .mapToInt(this::parseToInt)
                .sum();
    }

    private int parseToInt(String string) {
        return Integer.parseInt(string);
    }

    private String[] generateSplitStrings(String string, String separators) {
        if (string.startsWith(PREFIX_OF_CHANGE_SEPARATOR)) {
            return splitBySeparators(pickValidString(string), pickSeparator(string));
        }

        return splitBySeparators(string, separators);
    }

    private String[] splitBySeparators(String string, String separators) {
        return string.split(separators);
    }

    private String pickValidString(String string) {
        int validStringBeginIndex = 4;

        return string.substring(validStringBeginIndex);
    }

    private String pickSeparator(String string) {
        int separatorBeginIndex = 2;
        int separatorEndIndex = 3;

        return string.substring(separatorBeginIndex, separatorEndIndex);
    }
}
