class Solution {
    public int removeElement(int[] nums, int val) {
       int reader=0;
       int writer=0;
       int n=nums.length;

       while(reader<n){
           if(nums[reader] == val){
               reader++;
           }else{
               nums[writer] = nums[reader];
               reader++;
               writer++;
           }
       }
       return writer;
    }
}