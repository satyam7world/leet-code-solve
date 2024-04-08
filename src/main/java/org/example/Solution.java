package org.example;

import java.util.Arrays;

public class Solution {
    public int lengthOfLastWord(String s) {
        var newTrim = s.trim();
        var finalValue = newTrim.length();
        for (int i = newTrim.length(); i > 0; i--) {
            if (newTrim.charAt(i - 1) == ' ') {
                finalValue = newTrim.length() - i;
                break;
            }
        }
        return finalValue;
    }
}
