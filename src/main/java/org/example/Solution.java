package org.example;

import java.util.*;

class Solution {
    public boolean checkRecord(String s) {
        char[] record = s.toCharArray();
        char lastRecord = 'X';
        int totalAbsentDays = 0;
        int lateConsecutive = 1;
        for (char r : record) {
            if (r == 'A') {
                totalAbsentDays++;
            }
            if (totalAbsentDays > 2) {
                break;
            }

            if (r == 'L') {
                if (lastRecord == 'L') {
                    lateConsecutive++;
                } else {
                    lateConsecutive = 1;
                }
            }

            lastRecord = r;
        }

        System.out.println(lateConsecutive);

        if (totalAbsentDays > 2 || lateConsecutive >= 3) {
            return false;
        }

        return true;
    }
}