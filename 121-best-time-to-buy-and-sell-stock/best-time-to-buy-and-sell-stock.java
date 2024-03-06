class Solution {
    public int maxProfit(int[] prices) {
        int difference = 0;
        int minVal = Integer.MAX_VALUE;

        for(int i=0; i<prices.length; i++){
            if(prices[i] < minVal){
                minVal = prices[i];
            }
            difference = Math.max(difference, prices[i]-minVal);
            }
        return difference;
    }
}