package com.thoughtworks.basic;

import java.util.Arrays;

class StringCalculator {
    int add(String string) {
        if (string.isEmpty()) {
            return 0;
        }

        if (string.length() == 1) {
            return Integer.parseInt(string);
        }

        return Arrays.stream(string.split(","))
                .mapToInt(Integer::parseInt)
                .sum();
    }
}
