package com.example;

public class StringManipulator {

    // Method for concatenating two strings
    public String concat(String str1, String str2) {
        return str1 + str2;
    }

    // Method for capitalizing
    public String capitalize(String str) {
        return str.toUpperCase();
    }

    // Method for removing all whitespaces
    public String removeWhitespaces(String str) {
        return str.replaceAll("\\s+", "");
    }

    // Method for truncating a string
    public String truncate(String str, int maxLength) {
        if (str.length() <= maxLength) {
            return str;
        }
        return str.substring(0, maxLength) + "...";
    }
}
