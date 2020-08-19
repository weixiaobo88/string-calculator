package com.thoughtworks.basic;

class StringCalculator {
    int add(String string) {
        if (string.isEmpty()) {
            return 0;
        }
        return Integer.parseInt(string);
    }
}
