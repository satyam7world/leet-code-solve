package org.example;

import java.util.*;

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> results =
                new HashSet<List<Integer>>();
//        List<? extends List<Integer>> results = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                for (int k = 2; k < nums.length; k++) {
                    HashSet<Integer> indexSet = new HashSet<>();
                    indexSet.add(i);
                    indexSet.add(j);
                    indexSet.add(k);
                    if (indexSet.size() != 3) {
                        continue;
                    }
                    if (nums[i] + nums[j] + nums[k] == 0) {
//                        System.out.println(" " + i + " " + j + " " + k);
                        List<Integer> newList = new ArrayList<Integer>();
                        newList.add(nums[i]);
                        newList.add(nums[j]);
                        newList.add(nums[k]);

                        Collections.sort(newList);

                        results.add(newList);
                    }
                }
            }
        }
        return results.stream().toList();
    }
}