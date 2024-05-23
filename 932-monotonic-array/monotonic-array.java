class Solution {
    public boolean isMonotonic(int[] nums) {
        return increase(nums) || decrease(nums);
    }

    public boolean increase(int[] nums){
        for(int i=0; i<nums.length - 1; i++){
            if(nums[i] > nums[i+1]){
                return false;
            }
        }
        return true;
    }

    public boolean decrease(int[] nums){
        for(int i=0; i<nums.length - 1; i++){
            if(nums[i] < nums[i+1]){
                return false;
            }
        }
        return true;
    }
}