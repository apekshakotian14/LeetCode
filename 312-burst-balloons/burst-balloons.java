class Solution {
    public int maxCoins(int[] nums) {
        if(nums.length == 0 || nums == null) return 0;
        int n = nums.length;
        int [][]dp = new int[n][n];
        
        for(int le = 1; le <= n ; le++){
            for(int i=0; i <= n-le; i++){
                int j=i+le-1;
                int max = 0;
                for(int k=i; k<=j; k++){
                    int before = 0;
                    if(i!=k){
                        before = dp[i][k-1];
                    }
                    int after = 0;
                    if(j != k ){
                        after = dp[k+1][j];
                    }
                    int left = 1;
                    if(i != 0){
                        left = nums[i-1];
                    }
                    int right = 1;
                    if(j != n-1){
                        right = nums[j+1];
                    }
                    max = Math.max(max, before + left * nums[k]* right + after);
                }
                dp[i][j] = max;
            }
        }
        return dp[0][n-1];
    }
}