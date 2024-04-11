package org.example;

import java.util.ArrayList;
import java.util.HashSet;

public class Solution {
    public int romanToInt(String s) {
        ArrayList<Integer> algebra = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            int intValue = charToInt(currentChar);
            if (i < (s.length() - 1)) {
                int nextInt = s.charAt(i + 1);
                if (nextInt > intValue) {
                    intValue *= -1;
                }
            }
            algebra.add(intValue);
        }
        int answer = 0;
        for (int i : algebra) {
            answer += i;
        }
        return answer;
    }

    int charToInt(char i) {
        switch (i) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;

            default:
                return 0;
        }
    }
}