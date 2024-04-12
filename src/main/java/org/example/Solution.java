package org.example;

import java.util.*;

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Set<List<Integer>> result = new HashSet<>();
        if (target % 2 == 0) {
            for (int i : candidates) {
                if (target % i == 0) {
                    int times = target / i;
//                    System.out.println("int => " + i);
//                    System.out.println("times => " + times);
                    List<Integer> temp = new ArrayList<>();
                    for (int k = 0; k < times; k++) {
                        temp.add(times);
                    }
                    result.add(temp);
                }
            }
        }
        for (int i = 0; i < candidates.length; i++) {
            List<Integer> temp = new ArrayList<>();
            for (int j = 0; j < candidates.length; j++) {
                int valueI = candidates[i];
                int valueJ = candidates[j];
                if (valueI + valueJ == target) {
                    if (valueI > valueJ) {
                        temp.add(valueJ);
                        temp.add(valueI);
                    } else {
                        temp.add(valueI);
                        temp.add(valueJ);
                    }
                }
            }
            if (temp.size() > 0) {
                result.add(temp);
            }
        }
        return result.stream().toList();
    }
}
