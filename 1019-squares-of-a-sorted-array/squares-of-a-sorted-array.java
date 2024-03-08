class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int left = 0;
        int right = n-1;

        for(int i=n-1; i>=0; i--){
            int square;
            if(Math.abs(nums[left]) < Math.abs(nums[right])){
                square = nums[right];
                right--;
            }else{
                square = nums[left];
                left++;
            }
            res[i] = square * square;
        }
        return res;
    }
}