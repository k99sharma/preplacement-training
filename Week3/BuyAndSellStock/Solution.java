package Week3.BuyAndSellStock;

class Solution {
    public int maxProfit(int[] prices) {
        int minimal = prices[0];
        int profit = 0;

        for(int i=1; i<prices.length; i++){
            int cost = prices[i] - minimal;
            profit = Math.max(profit, cost);

            minimal = Math.min(minimal, prices[i]);
        }

        return profit;
    }
}