class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int minVal = prices[0];

        for(int i=1; i<prices.length; i++){
            if(prices[i] < minVal){
                minVal = prices[i];
            }
            profit = Math.max(profit, prices[i]-minVal);
            }
        return profit;
    }
}