package org.example;

import java.sql.Array;
import java.util.Arrays;

public class Solution {
    public int[] plusOne(int[] digits) {
        // check if last digit is not nine
        var lastDigit = digits[digits.length - 1];
        if (lastDigit != 9) {
            digits[digits.length - 1] = lastDigit + 1;
            return digits;
        } else { // needs to change the second last element
            StringBuilder toString = new StringBuilder();
            for (int i : digits) {
                toString.append(i);
            }
            Integer before = Integer.valueOf(toString.toString());
            int finalInt = before + 1;
            var responseBack = new int[String.valueOf(finalInt).length()];
            var charArr = String.valueOf(finalInt).toCharArray();
            for (int i = 0; i < charArr.length; i++) {
                System.out.println(charArr[i]);
                responseBack[i] = Integer.valueOf(String.valueOf(charArr[i]));
            }
            return responseBack;
        }
    }
}
