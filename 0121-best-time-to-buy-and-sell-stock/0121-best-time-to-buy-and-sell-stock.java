class Solution {
    public int maxProfit(int[] prices) {
        int difference = 0;
        int minValue = Integer.MAX_VALUE;
        
        for(int i=0; i<prices.length; i++){
            if(prices[i]< minValue){
                minValue = prices[i];
            }
            difference = Math.max(difference, prices[i]-minValue); 
        }
        return difference;
    }
}