package org.example;

import java.util.*;

class Solution {
    public int trap(int[] height) {
        // find MaxLeft
        int[] maxLeft = new int[height.length];
        int lastMax = 0;

        for (int i = 0; i < height.length; i++) {
            if (height[i] > lastMax) {
                maxLeft[i] = lastMax;
                lastMax = height[i];
            }
        }
        int[] minValue = new int[height.length];
        // find minimum of both
        int currentRightMax = 0;
        for (int i = height.length - 1; i > 0; i--) {
            if (height[i] > currentRightMax) {
                minValue[height.length - i] = Math.min(height[i], maxLeft[height.length - i]);
            }
        }

        System.out.println(Arrays.toString(maxLeft));

        return -1;
    }
}