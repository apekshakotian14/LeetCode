class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        if(n == 1) return 0;
        int jumps = 1;
        int curr = nums[0];
        int next = nums[0];
        for(int i=0; i<nums.length; i++){
            next = Math.max(next, i+nums[i]);
            if(i== curr && i!= n-1){
                jumps++;
                curr = next;
            }
        }
        return jumps;
    }
}