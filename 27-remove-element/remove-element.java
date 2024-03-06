class Solution {
    public int removeElement(int[] nums, int val) {
        int reader = 0;
        int writter = 0;
        int n = nums.length;
        
        while(reader<n){
            if(nums[reader] == val){
                reader++;
            }else{
                nums[writter] = nums[reader];
                writter++;
                reader++;
            }
        }
        return writter;
    }
}