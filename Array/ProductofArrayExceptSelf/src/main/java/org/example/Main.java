package org.example;

//Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
//
//The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
//
//You must write an algorithm that runs in O(n) time and without using the division operation.

import java.util.Arrays;

public class Main {
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int[] leftProduct = new int[n], rightProduct = new int[n];

        leftProduct[0] = 1;
        rightProduct[n - 1] = 1;

        for (int i = 1; i < n; i++)
            leftProduct[i] = leftProduct[i - 1] * nums[i - 1];
        for (int i = n - 2; i >= 0; i--)
            rightProduct[i] = rightProduct[i + 1] * nums[i + 1];
        for (int i = 0; i < n; i++)
            result[i] = leftProduct[i] * rightProduct[i];

        return result;
    }

    public static void main(String[] args) {
        int[] nums = { 1,2,3,4 };
        System.out.print(Arrays.toString(productExceptSelf(nums)));
    }
}