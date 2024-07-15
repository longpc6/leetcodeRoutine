package org.example;

public class Main {
    public static int maxProduct(int[] nums) {
        int maxProd = nums[0];
        int prod = maxProd;

        for (int i = 1; i < nums.length; i++) {
            prod = Math.max(prod * nums[i], nums[i]);
            maxProd = Math.max(maxProd, prod);
        }

        return maxProd;
    }
    public static void main(String[] args) {
        int[] nums = {-2,0,-1};
        System.out.print(maxProduct(nums));
    }
}