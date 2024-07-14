package org.example;

public class Main {
    public static int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int sum = 0;

        if (nums.length == 1)
            return nums[0];

        for (int num : nums) {
            if (sum >= 0)
                sum += num;
            else
                sum = num;

            if (sum > maxSum)
                maxSum = sum;
        }

        return maxSum;
    }

    public static int anotherFasterMaxSubArray(int[] nums) {
        int maxSum = nums[0];
        int sum = maxSum;

        for (int i = 1; i < nums.length; i++) {
            sum = Math.max(sum + nums[i], nums[i]);
            maxSum = Math.max(sum, maxSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {5,4,-1,7,8};
        System.out.print(maxSubArray(nums));
    }
}