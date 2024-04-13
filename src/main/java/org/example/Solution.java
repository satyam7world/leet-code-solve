package org.example;

import java.util.*;

class Solution {
    public String reverseWords(String s) {
        String result = "";
        int indexO = 0;
        for (String fraction : s.split(" ")) {
            for (int i = fraction.length() - 1; i >= 0; i--) {
                result = result.concat(String.valueOf(fraction.charAt(i)));
            }

            indexO++;

            if (indexO < s.split(" ").length) {
                result = result.concat(" ");
            }

        }
        return result;
    }
}