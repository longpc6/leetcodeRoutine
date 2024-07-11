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
        Map<Integer, Integer> map = new HashMap<>();
        int min = prices[0], max = -1;
        map.put(min, 0);
        map.put(max, -1);
        for (int i = 0; i < prices.length; i++) {
            if (min > prices[i]) {
                map.remove(min);
                min = prices[i];
                map.put(min, i);
            }
            if (max < min) {
                map.remove(max);
                max = prices[i];
                map.put(max, i);
            }
        }
        if (map.get(min) < map.get(max))
            return max - min;
        else
            return 0;
    }

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.print(maxProfit(prices));
    }
}