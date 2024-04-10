package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public int myAtoi(String s) {
        var pattern = Pattern.compile("[0-9]");
        Matcher matcher = pattern.matcher(s);
        List<Integer> integers = new ArrayList<>();

        while (matcher.find()) {
//            System.out.println(matcher.group());
            integers.add(Integer.valueOf(matcher.group()));
        }
        int multiplier = 1;
        for (int i = integers.size(); i > 0; i--) {
//            var oppo = integers.size() - i;

            multiplier *= 10;
        }
        return 0;
    }
}