package org.example;

public class Main {
    public static int maxProduct(int[] nums) {
        int n = nums.length;
        double leftProd = 1;
        double rightProd = 1;
        double result = nums[0];

        for (int i = 0; i < n; i++) {
            if (leftProd == 0)
                leftProd = 1;
            if (rightProd == 0)
                rightProd = 1;

            leftProd *= nums[i];
            rightProd *= nums[n - i - 1];

            result = Math.max(result, Math.max(leftProd, rightProd));
        }

        return (int)result;
    }
    public static void main(String[] args) {
        int[] nums = {0,10,10,10,10,10,10,10,10,10,-10,10,10,10,10,10,10,10,10,10,0};
        System.out.print(maxProduct(nums));
        // System.out.print(10 * 10 * 10 * -10);
    }
}