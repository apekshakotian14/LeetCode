class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int max = 0;
        int left = 0;
        int right = n-1;
        while(left < right){
            int currentArea = Math.min(height[left], height[right]) * (right - left);
            max = Math.max(max, currentArea);
            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }
        }
        return max;
    }
}