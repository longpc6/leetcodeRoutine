package org.example;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int[] nums = {3, 2, 4}, arr = twoSum(nums, 6);
        printIdxArr(arr, 2);
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement))
                return new int[] { map.get(complement),i };

            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("Error");
    }

    public static void printIdxArr(int[] array, int n) {
        System.out.print('[');
        for (int i = 0; i < n; i++) {
            System.out.print(array[i]);
            if (i != n - 1)
                System.out.print(',');
        }
        System.out.print(']');
    }
}