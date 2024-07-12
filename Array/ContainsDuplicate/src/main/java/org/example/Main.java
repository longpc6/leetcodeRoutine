package org.example;

//Given an integer array nums, return true if any value appears at least twice in the array,
//and return false if every element is distinct.

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i]))
                return true;
            else
                map.put(nums[i], i);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,3,3,4,3,2,4,2};
        System.out.print(containsDuplicate(nums));
    }
}