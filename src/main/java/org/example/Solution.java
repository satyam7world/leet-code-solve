package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Solution {
    public boolean isMatch(String s, String p) {
        try {
            Pattern pattern = Pattern.compile(p);
            Matcher match = pattern.matcher(s);
            return match.matches();
        } catch (PatternSyntaxException e) {
            return false;
        }
    }
}