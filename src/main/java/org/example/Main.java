package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        var sol = new Solution();
        var helloIndia = sol.trap(new int[]{
                0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1
        });
        System.out.println("final response");
        System.out.println(helloIndia);
    }
}