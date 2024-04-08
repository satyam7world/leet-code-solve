package org.example;

import java.util.Arrays;

public class Solution {
    public int[] plusOne(int[] digits) {
        // check if last digit is not nine
        var lastDigit = digits[digits.length - 1];
        var invokeCarry = false;
        var arrayInt = new int[digits.length + 1];
        for (int i = digits.length; i > 0; i--) {
            var currentDigit = digits[i - 1];
            var currentUpdate = currentDigit;
            if (i == 1 && invokeCarry) {
                System.out.println("need extra digit");
                arrayInt[digits.length] = currentDigit + 1;
            }
            if (i == digits.length || invokeCarry) {
                var increment = currentDigit + 1;
                if (increment == 10) { // send a carry
                    System.out.println(0);
                    invokeCarry = true;
//                    arrayInt[digits.length - i] = increment;
                    continue;
                }
                currentUpdate = increment;
//                arrayInt[digits.length - i] = increment;
            }
            arrayInt[digits.length - i] = currentUpdate;
            invokeCarry = false;
        }

        System.out.println("new thing");
        System.out.println(Arrays.toString(arrayInt));
        return digits;
    }
}
