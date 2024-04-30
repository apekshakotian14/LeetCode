class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int low = 0;
        int high = nums.length - 1;
        int mid = low + (high - low)/2;
        return nums[mid];
    }
}