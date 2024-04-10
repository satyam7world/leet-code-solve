package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public int myAtoi(String s) {
        var pattern = Pattern.compile("[0-9]");
        Matcher matcher = pattern.matcher(s.trim());
        List<Integer> integers = new ArrayList<>();

        while (matcher.find()) {
//            System.out.println(matcher.group());
            integers.add(Integer.valueOf(matcher.group()));
        }
        List<Integer> correctFormInt = new ArrayList<>();
        int multiplier = 1;
        for (int i = integers.size(); i > 0; i--) {
//            var oppo = integers.size() - i;
            correctFormInt.add(integers.get(i - 1) * multiplier);
            multiplier *= 10;
        }

        Integer finalAnswer = 0;
        for (Integer i : correctFormInt) {
            finalAnswer += i;
        }
        return finalAnswer;
    }
}