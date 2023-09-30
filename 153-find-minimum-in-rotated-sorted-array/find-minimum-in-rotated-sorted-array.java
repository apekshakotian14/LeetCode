class Solution {
    public int findMin(int[] nums) {
        if(nums == null || nums.length == 0) return -1;
        int low = 0;
        int n = nums.length;
        int high = n - 1;
        
        while(low <= high){
            //check whole array is sorted
            if(nums[low] <= nums[high]) return nums[low];
            //will calculate the middle, and check adjacent elements are lesser than middle
            int mid = low + (high - low)/2;
            if((mid == 0 || nums[mid] < nums[mid - 1]) && (mid == n - 1 || nums[mid] < nums[mid+1])){
                return nums[mid];
            } //check for the unsorted array
            else if(nums[low] <= nums[mid]){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        
        return 99999;
    }
}