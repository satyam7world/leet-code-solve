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
            System.out.println("digit length " + digits.length);
            // this may get complicated if the second last is also 9
            var arrayR = new int[digits.length + 1];
            var carriageLoad = false;
            for (int i = digits.length; i > 0; i--) {
                var currentDigit = digits[i - 1];
                System.out.println("current Digit = " + currentDigit);
                if (carriageLoad) {
                    arrayR[i] = currentDigit + 1;
                    carriageLoad = false;
                }
                if (currentDigit == 9) {
                    arrayR[i] = 0;
                    carriageLoad = true;
                }
            }
            System.out.println(Arrays.toString(arrayR));
        }
        return digits;
    }
}
