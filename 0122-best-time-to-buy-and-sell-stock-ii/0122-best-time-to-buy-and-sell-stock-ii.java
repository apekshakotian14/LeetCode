class Solution {
    public int maxProfit(int[] prices) {
        int sum = 0;
        int valley = Integer.MAX_VALUE;
        int peak = valley;
        
        for(int i=0; i<prices.length; i++){
            if(prices[i] < peak){
                sum += peak - valley;
                
                valley = prices[i];
                peak = valley;
            } else{
                peak = prices[i];
            }
        }
        sum += peak - valley;
        return sum;
    }
}