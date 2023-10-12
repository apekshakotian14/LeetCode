class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
           List<Integer> list = new ArrayList<>();
           int n = nums.length;
           for(int i=0; i<n; i++){
               //if number is there make corresponding index negative
               int index = Math.abs(nums[i]) - 1;
               if(nums[index] > 0){
                   nums[index] = nums[index] * -1;
               }
           }

           for(int i=0; i<n ; i++){
               if(nums[i] > 0){
                   list.add(i+1);
               }else{
                   nums[i] = nums[i] * -1;
               }
           }
           return list;
    }
}