class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int low = 0;
        int high = n-1;
        int mid = 0;
        while(mid <= high){
            if(nums[mid] == 2){
                swap(nums, mid, high);
                high--;
            }else if(nums[mid] == 0){
                swap(nums, mid, low);
                mid++;
                low++;
            }else{
                if(nums[mid] == 1){
                    mid++;
                }
            }
        }   
        }
        private void swap(int[] nums, int i, int j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }

}
