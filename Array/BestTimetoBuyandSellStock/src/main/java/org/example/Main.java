package org.example;

import java.util.HashMap;
import java.util.Map;

    //    You are given an array prices where prices[i] is the price of a given stock on the ith day.
    //
    //    You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
    //
    //    Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

public class Main {
    public static int maxProfit(int[] prices) {
        int buyPrice = prices[0], profit = 0;

        for (int price : prices) {
            if (buyPrice > price)
                buyPrice = price;
            else {
                int currentProfit = price - buyPrice;
                profit = Math.max(currentProfit, profit);
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.print(maxProfit(prices));
    }
}