package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        var sol = new Solution();
        int[] helloIndia = sol.plusOne(new int[]{1, 2, 9});
        System.out.println("final response");
        System.out.println(Arrays.toString(helloIndia));
    }
}