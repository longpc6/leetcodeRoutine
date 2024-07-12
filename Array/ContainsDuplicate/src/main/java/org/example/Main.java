package org.example;

//Given an integer array nums, return true if any value appears at least twice in the array,
//and return false if every element is distinct.

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
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

    public static boolean anotherContainsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) return true;
            set.add(num);
        }
        return false;
    }

    public static boolean anotherSlowerContainsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++)
            if (nums[i] == nums[i + 1]) return true;
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        // System.out.print(containsDuplicate(nums));
        // System.out.print(anotherContainsDuplicate(nums));
        System.out.print(anotherSlowerContainsDuplicate(nums));
    }
}