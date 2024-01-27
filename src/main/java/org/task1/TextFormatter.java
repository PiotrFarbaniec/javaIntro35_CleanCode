package org.task1;

import java.util.Arrays;

public class TextFormatter {
    private String text;

    public TextFormatter(String text) {
        this.text = text.toLowerCase();
    }

    public boolean isContainSigns() {
        return !(text.length() == 0);
    }

    public boolean isPalindromeText () {
        return Arrays.equals(convertTextToArray(), reverseTextArray());
    }

    public int getTextLenght() {
        return text.length();
    }

    private char [] convertTextToArray () {
        char[] textArray = text.toCharArray();
        return textArray;
    }

    private char [] reverseTextArray() {
        char[] originText = convertTextToArray();
        char[] reverseText = new char[convertTextToArray().length];

        for (int i = 0; i < originText.length; i++) {
            reverseText[i] = originText[(originText.length-1)-i];
        }
        return reverseText;
    }
}